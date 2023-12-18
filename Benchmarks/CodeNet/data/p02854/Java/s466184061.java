
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long[] A=new long[N];

	    int l=0;
	    for (int i=0; i<N; i++) {
	    	A[i]=gl();
	    	l+=A[i];
	    }
	    
	    long min=Long.MAX_VALUE;
	    long a=0;
	    for (int i=0; i<N; i++) {
	    	a+=A[i];
	    	long s=Math.abs(l-2*a);
	    	if(min>s) {
	    		min=s;
	    	}
	    }
        System.out.print(min);
//        if (K<A) {
//        	System.out.println(K);
//        }else if(K<A+B){
//        	System.out.println(A);
//        } else {
//        	System.out.print(A-(K-A-B));
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