

import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int max=1;
	    int t=0;

	    for (int i=0; i<N;i++) {
	    	int a=gi();
	    	int b=gi();
	    	if (a>max) {
	    		max=a;
	    		t=b;
	    	}
	    }
	    System.out.println(max+t);
	}

	public static double f(double r, double n, double m, double i) {
		double a = 0;
		double b=0;
		if(0<i&&i<n) {
			a=Math.abs(r-((2*r/n)*i));
			a= Math.sqrt(Math.pow(r, 2) - Math.pow(a, 2));
		}
		if(0<i-m&&i-m<n) {
			b=Math.abs(r-(2*r*(i-m)/n));
			b=Math.sqrt(Math.pow(r, 2) - Math.pow(b, 2));
		}
		return 2* Math.max(a, b);
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