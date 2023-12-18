

import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long n=gl();
	    int k =NsinKeta(n,10);

        long m=9*(k-1);
        long l=(long)Math.pow(10, k-1);
        m+=(Math.floorDiv(n-l+1, l));
        System.out.println(m);
	}

	// s進数で表した時の桁数
		public static int NsinKeta(long n, long s) {
			if(n==0) return 1;

			int i=0;
			while(n!=0) {
				n=Math.floorDiv(n, s);
				i++;
			}

			return i;
		}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}