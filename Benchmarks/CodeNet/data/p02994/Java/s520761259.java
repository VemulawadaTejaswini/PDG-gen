

import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int N=gi();
        int L=gi();
        int c=0;
        if (L>0) {
        	for (int i=2; i<=N; i++) {
        		c+=L+i-1;
        	}
        } else if(N+L>0) {
        	for (int i=1; i<=N; i++) {
        		c+=L+i-1;
        	}
        } else {
        	for (int i=1; i<=N-1; i++) {
        		c+=L+i-1;
        	}
        }
        
        System.out.print(c);

//        if (s>L[n-2]) {
//        	System.out.println("Yes");
//        }else {
//        	System.out.println("No");
//        }
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