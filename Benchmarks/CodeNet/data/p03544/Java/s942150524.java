import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    long[] L=new long[90];
	    L[0]=2;
	    L[1]=1;
	    int i=2;
	    while(true) {
	    	L[i]=L[i-1]+L[i-2];
	    	if(i==n)break;
	    	i++;
	    }
	    System.out.print(L[n]);
//	    if (a+b==15) {
//	    	System.out.print("+");
//	    }else if(a*b==15) {
//	    	System.out.print("*");
//	    } else {
//	    	System.out.print("x");
//	    }



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