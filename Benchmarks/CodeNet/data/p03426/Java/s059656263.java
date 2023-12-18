import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		//StringBuilder sb = new StringBuilder();
		
		int H = sc.nextInt(), W = sc.nextInt(), D = sc.nextInt();
		int r[] = new int[H*W+1];
		int c[] = new int[H*W+1];
		
		for(int i=1;i<=H;i++){
			for(int j=1;j<=W;j++){
				int A = sc.nextInt();
				r[A] = i;
				c[A] = j;
			}
		}
		
		int dp[][] = new int[D+1][H*W/D+10];
		
		for(int i=1;i<=D;i++){
			for(int j = 1;i+D*j<=H*W;j++){
				dp[i][j] = dp[i][j-1] + Math.abs(r[i+D*(j-1)]-r[i+D*j]) + Math.abs(c[i+D*(j-1)]-c[i+D*j]); 
			}
		}
		
		int Q = sc.nextInt();
		
		while(Q-->0){
			int L = sc.nextInt(), R = sc.nextInt();
			
			int i = 1;
			while((L-i)%D !=0)	i++;
			
			System.out.println(dp[i][(R-i)/D] - dp[i][(L-i)/D]);
		}
		
	}
}