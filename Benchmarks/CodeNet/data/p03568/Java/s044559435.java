
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int[] A=new int[N];
	    int w=1;
	    for (int i=0; i<N; i++) {
	    	A[i]=gi();
	    	if(A[i]%2==0) {
	    		w*=2;
	    	}
	    }

	    long a=(long)Math.pow(3, N)-w;
        System.out.println(a);
//	    if(max>s-max) {
//	    	System.out.println(s-max-1);
//	    }
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