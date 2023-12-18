

import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int n=gi();
        long[] T=new long[n];
        
        long s = 1;
        for (int i=0; i< n; i++) {
            T[i]=gl();
            s = (s/uclid(s, T[i])) * T[i];
        }

	    System.out.println(s);

//        if (s>L[n-2]) {
//        	System.out.println("Yes");
//        }else {
//        	System.out.println("No");
//        }
	}


	public static long uclid(long m, long n) {
    	if (m<n) {
			m^=n;
			n^=m;
			m^=n;
		}

		while(true) {
			long t=m%n;
			if (t==0) {
				return n;
			} else {
				m=n;
				n=t;
			}
		}
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