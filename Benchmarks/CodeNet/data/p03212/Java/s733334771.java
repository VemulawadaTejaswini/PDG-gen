
import java.util.Scanner;

public class Main {
	
	static int ans = 0;
	static int temp3,temp5,temp7;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		temp3 = 0; temp5 = 0; temp7 = 0;
		dfs(n,0L);
		System.out.println(ans);
		

	}
	
	static void dfs(int n , long num) {
		
		if(num*10+ 3 <= n) {
			temp3++;
			dfs(n,num*10+3);
			temp3--;
		}
		if(num*10+5 <= n) {
			temp5++;
			dfs(n,num*10+5);
			temp5--;
		}
		if(num*10+7 <= n) {
			temp7++;
			dfs(n,num*10+7);
			temp7--;
		}
		
		if(temp3 > 0 && temp5 > 0 && temp7 > 0) {
			ans++;
		}
		return;
	}

}
