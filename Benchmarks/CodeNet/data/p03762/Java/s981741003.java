import java.util.Scanner;

public class Main {
	
	public static void main (String[] args){
		int mod = (int)10e9+7;
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int m = cin.nextInt();
		long[] xArray = new long[n];
		long[] yArray = new long[m];
		for(int i=0;i<n;i++){
			xArray[i] = cin.nextLong();
		}
		for(int i=0;i<m;i++){
			yArray[i] = cin.nextLong();
		} 
		//然后算segmay 和 segmax
		long segmax = 0;
		long segmay = 0;
		for (int i=n-1;i>=0;i--){
			segmax += xArray[i] * (2*i - n + 1) % mod;
			segmax %= mod;
		}
		
		for (int i=m-1;i>=0;i--){
			segmay += yArray[i] * (2*i - m + 1) % mod; 
			segmay %= mod;
		}
		
		System.out.println((int)(segmax*segmay%mod));
	}
}