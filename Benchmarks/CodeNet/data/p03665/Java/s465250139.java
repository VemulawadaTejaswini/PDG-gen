

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		final int N = in.nextInt();
		final long P = (long)(in.nextInt());
		boolean a[] = new boolean[N];
		for(int i = 0; i < N;i++){
			a[i] = in.nextInt()%2==0;
		}

		long gusuKosu = 0l;
		for(boolean b : a){
			if(b) gusuKosu++;
		}
		long kisuKosu = (long)(a.length) - gusuKosu;

		long result = 0;
		for(long i = P; i <= kisuKosu; i+=2){
			result += combination(kisuKosu, i);
		}
		long result2 = 0;
		for(long i = 0; i <= gusuKosu; i++){
			result2 += combination(gusuKosu, i);
		}
		System.out.println(result * result2);
		in.close();

	}
//	long combination(long n, long r){
//		long a = 1;
//		for(long i = n; i > n-r; i--){
//			a *= i;
//		}
//		for(long i = 1; i <= r; i++){
//			a /= i;
//		}
//		return a;
//	}
	long combination( long n, long m ) {
	    if( n < m || m < 0 ) {
	        throw new IllegalArgumentException( "引数の値が不正です ( n : " + n + ", m : " + m + ")" );
	    }
	    long c = 1;
	    m = ( n - m < m ? n - m : m );
	    for( long ns = n - m + 1, ms = 1; ms <= m; ns ++, ms ++ ) {
	        c *= ns;
	        c /= ms;
	    }
	    return c;
	}


}
