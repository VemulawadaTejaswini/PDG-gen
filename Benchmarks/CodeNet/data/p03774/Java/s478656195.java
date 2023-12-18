import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    int m=gi();
	    long[] a=new long[n];
	    long[] b=new long[n];
	    long[] c=new long[m];
	    long[] d=new long[m];

	    for (int i=0; i<n;i++) {
	    	a[i]=gl();
	    	b[i]=gl();
	    }
	    for (int i=0; i<m;i++) {
	    	c[i]=gl();
	    	d[i]=gl();
	    }

	    for (int i=0; i<n;i++) {
	    	long min=Long.MAX_VALUE;
	    	long minind = 0;
	    	for (int j=0; j<m;j++) {
	    		long man = Math.abs(a[i]-c[j]) + Math.abs(b[i]-d[j]);
	    	    if (min > man) {
	    	    	min = man;
	    	    	minind=j+1;
	    	    }
	    	}
	    	System.out.println(minind);
	    }


        //System.out.println(f(n));
//        if (a<b) {
//        	System.out.print(Math.max(b-a-w, 0));
//        }else {
//        	System.out.print(Math.max(a-b-w, 0));
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