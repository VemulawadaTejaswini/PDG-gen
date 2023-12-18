

import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    String S=gs();

	    int min=N-1;
	    int e=0;
	    int w=0;
        for(int i=1; i<S.length();i++) {
        	char c=S.charAt(i);
        	if(c=='E') {
        		e++;
        	}
        }

        min=e;
        for(int i=1; i<S.length();i++) {
        	char c=S.charAt(i);
        	char bc=S.charAt(i-1);
        	int n=0;
        	if(c=='E') {
        		e--;
        	}
        	if(bc=='W') {
        		w++;
        	}
            n=e+w;
        	min=Math.min(min, n);
        }

		System.out.println(min);
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