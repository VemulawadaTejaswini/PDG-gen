import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		long A = s.nextLong();
		long B = s.nextLong();
		long C = s.nextLong();
		long D = s.nextLong();

		/*
		long count = 0;
		for (long i = A; i <= B; i++) {

			if(i % C ==0) continue;
			if(i % D ==0) continue;
			count++;
		}

		System.out.println(count);
		*/

		//Cの倍数の個数
		long cBai = B/C - (A-1)/C;
		//Dの倍数の個数
		long dBai = B/D - (A-1)/D;
		//CとDの倍数の個数
		long cdBai = B/(lcm(C,D)) - (A-1)/lcm(C,D);
		//全体から引く
		long answer = (B - (A-1) - (cBai + dBai - cdBai));

		System.out.println(answer);

	}

	private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}

	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}
