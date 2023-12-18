
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    long[] a=new long[n];
	    for(int i=0; i<n;i++) {
	    	a[i]=gl();
	    }
	    int c=0;
	    for(int i=1; i<n;i++) {
	    	if(a[i-1]==a[i]) {
	    		c++;
	    		a[i]=-1;
	    	}
	    }
//	    if (s>x) {
//	    	System.out.println(n-1);
//	    } else {
//	    	Arrays.parallelSort(a);
//
//	    	System.out.println(c);
//	    }
	    System.out.println(c);
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