
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    long x=gl();
	    long[] a=new long[n];
	    int s=0;
	    for(int i=0; i<n;i++) {
	    	a[i]=gl();
	    	s+=a[i];
	    }
	    if (s<x) {
	    	System.out.println(n-1);
	    } else {
	    	Arrays.parallelSort(a);
	    	int c=0;
	    	for(int i=0; i<n;i++) {
		    	if(x>=a[i]) {
		    		x-=a[i];
		    		c++;
		    	}else {
		    		break;
		    	}
		    }
	    	System.out.println(c);
	    }
	    //System.out.println(d);
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