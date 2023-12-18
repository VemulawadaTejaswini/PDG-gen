

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int N=gi();
        int M=gi();
        int X=gi();
        int Y=gi();
        int[] xa = new int[N];
        int[] ya = new int[M];
        for (int i=0; i<N; i++) {
        	xa[i]=gi();
        }
        for (int i=0; i<M; i++) {
        	ya[i]=gi();
        }
        Arrays.parallelSort(xa);
        Arrays.parallelSort(ya);

        if (xa[xa.length-1]<ya[0] && xa[xa.length-1]<Y && ya[0]>X) {
           System.out.println("No War");
	    } else {
	    	System.out.println("War");
	    }
//        if (a>0) {
//        	System.out.println("Yes");
//        }else {
//        	System.out.println("No");
//        }
	}


	public static long d(long n) {
		String a=String.valueOf(n);
		return (long)a.length();
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