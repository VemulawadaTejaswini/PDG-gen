
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int a=gi();
        int b=gi();
        int c=gi();
        int d=gi();
       
        int k=0;
        while(a>0&&c>0) {
        	if(k%2==1) {
        		a-=d;
        	}else {
        		c-=b;
        	}
        	k++;
        }

        //System.out.println();
        if (a>0) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
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