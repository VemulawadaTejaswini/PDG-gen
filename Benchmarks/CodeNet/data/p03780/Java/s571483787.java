import java.util.*;

public class Main {
	
	boolean [] used, ans;
	int [] data;
	int n,k;
	
	private void dfs(int depth){
		if(depth == n){
			return;
		}
		int sum = 0;
		for(int i = 0; i< n;i++){
			if(used[i]) continue;
			sum += data[i];
		}
		if(sum < k) return;
		
		for(int i = 0; i < n; i++){
			if(used[i])continue;
			
			if(sum - data[i] < k){
				ans[i] = true;
				continue;
			}
			used[i] = true;
			dfs(depth + 1);
			used[i] = false;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			n = sc.nextInt();
			k = sc.nextInt();
			data = new int[n];
			used = new boolean[n];
			ans = new boolean[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			
			dfs(0);
			int count = 0;
			for(int i = 0; i < n; i++){
				if(!ans[i])count++;
			}
			System.out.println(count);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
