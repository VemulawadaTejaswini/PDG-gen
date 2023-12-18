
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int M=gi();
	    int K=gi();

	    for (int i=0; i<=N;i++) {
	    	for (int j=0; j<=M;j++) {
		    	int c=i*M+j*N-2*i*j;
		    	if(c==K) {
		    		System.out.println("Yes");
		    		return;
		    	}
		    }
	    }
	    

        System.out.println("No");
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