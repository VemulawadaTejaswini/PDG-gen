
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long[] A=new long[N+2];

	    for(int i=0; i<N; i++) {
	        A[i+1]=gl();
	    }

	    long sum=0;
	    long bx=0;
	    for(int i=0; i<N+2; i++) {
	        sum+=Math.abs(A[i]-bx);

	        bx=A[i];
	    }

	    for (int i=1; i<N+1; i++) {
		    long y=sum;
		    y-=Math.abs(A[i-1] - A[i]);
		    y-=Math.abs(A[i+1] - A[i]);
		    y+=Math.abs(A[i+1] - A[i-1]);
		    System.out.println(y);
	    }
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