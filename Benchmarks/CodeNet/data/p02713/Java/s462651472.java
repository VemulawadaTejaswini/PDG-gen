import java.util.Scanner;

public class Main {
//java11
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();

		int ans = 0;
		for(int a=1; a<=K; a++) {
			for(int b=1; b<=K; b++) {
				for(int c=1; c<=K; c++) {
					ans += gcd_triple(a, b, c);
				}
			}
		}

		System.out.println(ans);
	}

	static int gcd_triple(int a, int b, int c) {
		return gcd(gcd(a, b) , c);
	}

//	static int gcd(long m, long n) {
//	    if(m < n) return gcd(n, m);
//	    if(n == 0) return m;
//	    return gcd(n, m % n);
//	}
	static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

}
