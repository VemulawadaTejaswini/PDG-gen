
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int K=gi();
	    int T=gi();
	    int[] A=new int[T];
	    
	    int max=0;
	    int s=0;
	    for (int i=0; i<T;i++) {
	    	A[i]=gi();
	    	s+=A[i];
	    	if(max<A[i]) {
	    		max=A[i];
	    	}
	    }
	    

        System.out.println(Math.max(max*2-s-1, 0));
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