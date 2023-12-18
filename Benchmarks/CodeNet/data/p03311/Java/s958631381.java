
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long[] A=new long[N];

	    double av=0;
        for(int i=0; i<N;i++) {
        	A[i]=gl();
        	av+=A[i]-(i+1);
        }

        av=Math.floorDiv((long)av, N);
        long ans1=0;
        long ans2=0;

        for(int i=0; i<N;i++) {
        	ans1 +=Math.abs(A[i]-(av+i));
        	ans2 +=Math.abs(A[i]-(av+i+1));
        }

	    System.out.print(Math.min(ans1, ans2));
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