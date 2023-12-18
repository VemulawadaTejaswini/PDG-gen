

import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        long X=gl();
        long m=0;
        long t=0;
        for (int i=1; i<=X;i++) {
        	m+=(long)i;
        	if(m>=X) {
        		t=i;
        		break;
        	}
        }
        
        System.out.print(t);

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