import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{

	//static long[] a;
	static	int N ;
	static	int M ;
	static int[][] dp;

	static	boolean[] flag ;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);			//文字の入力
		N = scanner.nextInt();
		M = scanner.nextInt();

		String s = scanner.next();
		String t = scanner.next();

		int gcd = gcd(N, M);
		long ans = (long)N/gcd*M;

		for(int i = 0;i < N;i += N/gcd(N, M) ){
			int x = (int)((long)M*i/N);
			if(s.charAt(i) != t.charAt(x)){
				System.out.println("-1");
				return;
			}
		}
		

		System.out.println(ans);


	}





//	static long lcm(long m, long n) {
//		return m * n / gcd(m, n);
//	}
	static int gcd(int a, int b){
		if (a<b){	//a>=bほしょー
			int c = a;	a = b;	b = c;
		}
		while(a%b!=0) {
			int c = a%b;	a=b;	b=c;
		}
		return b;
	}
 
}


