import java.util.Scanner;

public class Main{
		
	public static void main(String args[]){
		  
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt = 0;
		
		long cn[] = new long[n+1];
		cn[0] = 0;
		for(int i = 1; i <= m; i++) {
			long l = sc.nextInt();
			long r = sc.nextInt();
			for(long j = l; j <= r; j++) {
				cn[(int) j]++;
			}
		}
			
		for(int i = 0; i <= n; i++) {
			if(cn[i] == m) {
				cnt++;
			}
		}
		
		System.out.println(cnt);		
	}
}
