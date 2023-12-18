
import java.util.*;
public class Main {
	public static long mod;
	public static void main(String[] args) {
		mod = (long)(Math.pow(10, 9)+7);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		//comb array
		int c[][] = new int [2005][2005];
		for (int tmpar[]:c) {
			for(int tmp:tmpar) {
				tmp = 0;
			}
		}
		//make pascal's triangle
		c[0][0]=1;
		for(int i=0;i<2003;i++) {
			for(int j=0;j<2003;j++) {
				c[i+1][j]+=c[i][j];
				c[i+1][j+1]+=c[i][j];
			}
		}	
		for(int i=1;i<=K;i++){
			long tmp1 = c[N-K+1][i];
			long tmp2 = c[K-1][i-1];
			long ans = (tmp1%mod)*(tmp2%mod);
			ans %= mod;
			System.out.println(ans);
		}
	}
}