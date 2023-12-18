import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int r = sc.nextInt();
		
		int MOD = 2019;
		int ans = Math.min(r, l);
		for(int i = l; i <= r ; i++) {
			for(int j = l; j <= r; j++) {
				int div = 0;
				for(int k = j+1; k <= r; k++) {
					div = j*k % MOD;
					ans = Math.min(ans, div);
				}
			}
		}		
		System.out.println(ans);
	}
	
}
