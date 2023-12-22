import java.util.*;

public class Main{
	
	//2213 start
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			int ans = 0;
			for(int i = 1 ; i < n; i++){
				int sum = i;
				for(int j = i+1; j <= n; j++){
					sum += j;
					if(sum == n){
						ans++;
						break;
					}
					else if(sum > n){
						break;
					}
				}
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}