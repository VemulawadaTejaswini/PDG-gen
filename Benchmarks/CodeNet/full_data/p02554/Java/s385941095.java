import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
			solve();
	}
	public static void solve() { 
		
		int n = sc.nextInt();
		int mod=1000000007;
		
      	long prod=((long)Math.pow(10, n-2) )%mod;
      	prod=(prod%mod)*2;
      prod=prod%mod;
		System.out.println(prod);
	}
}