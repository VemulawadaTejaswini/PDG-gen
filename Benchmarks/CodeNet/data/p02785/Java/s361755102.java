import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int n=gi();
        long k=gl();
        long[] H = new long[n];

	    for (int i=0; i<n; i++) {
	    	H[i] = gl();
	    }
	    
	    Arrays.parallelSort(H);
	    
	    long s = 0;
	    for (int i=0; i<n-k; i++) {
	    	s+=H[i];
	    }
	    
        System.out.println(s);
//        if (xo>w || yo>h) {
//        	System.out.print(0);
//        }else {
//        	System.out.print((h-yo)*(w-xo));
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