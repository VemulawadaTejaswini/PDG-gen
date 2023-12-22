import java.util.*;

public class Main{
	int ans = 0, n, s, last;
	boolean [] used;
	int [] max ;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		used = new boolean[10];
		while(sc.hasNext()){
			n = sc.nextInt();
			s = sc.nextInt();
			last = n - 1;
			ans = 0;
			Arrays.fill(used, false);
			max = new int[n];
			for(int i = n-1; i >= 0; i--){
				for(int j = i; j < n; j++){
					max[i] += -1 * (9 - (j - i)) * (n - j);
				}
			}
			dfs(0,-1 * s);
			System.out.println(ans);
		}
	}
	
	private void dfs(int deep,int sum) {
		if(deep == n){
			if(sum == 0) ans++;
			return;
		}
		
		for(int i = 9; i >= 0; i--){
			if(! used[i]){
				int value = i * (n - deep) + sum;
				if(value <= 0 && max[deep] <= value){
					used[i] = true;
					dfs(deep + 1, value);
					used[i] = false;
				}
			}
		}
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}