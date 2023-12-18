

import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        String S=gs();
        int k=0;
        int mk=0;
        for (int i=0; i<S.length();i++) {
        	char c=S.charAt(i);
        	if(c=='A' || c=='C' || c=='G' || c=='T') {
        		k++;
        		if(k>mk) {
        			mk=k;
        		}
        	} else {
        		k=0;
        	}
        }

        System.out.print(mk);

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