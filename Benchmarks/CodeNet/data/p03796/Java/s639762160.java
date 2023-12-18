import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int n;
		long []s = new long[100001];
		final long mod = 10000007;
		s[1] = 1;
		for(int i = 2; i <= 100000; i++){
			s[i] = (s[i-1] % mod * i % mod) % mod;
		}
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			n = cin.nextInt();
			System.out.println(s[n]);
		}
	}
}
