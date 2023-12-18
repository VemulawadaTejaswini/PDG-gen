

import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long[] A=new long[N];

	    long k=0;
	    long g=0;
        for(int i=0; i<N;i++) {
            A[i]=gl();
            if(A[i]%2==0) {
            	g++;
            } else {
            	k++;
            }
	    }
	    
        if(k%2==0) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }

		//System.out.println();
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