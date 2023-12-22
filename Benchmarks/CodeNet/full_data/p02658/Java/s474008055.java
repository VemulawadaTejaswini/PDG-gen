import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long[] A=new long[N];
	    
	    long m=1;
	    for (int i=0; i<N; i++) {
	    	A[i]=gl();
	    	if(A[i]==0) {
	    		System.out.print("0");
	    		return;
	    	}
	    }
	    
	    for (int i=0; i<N; i++) {
	    	if (Math.floorDiv(1000000000000000000l, m)<A[i]) {
	    		System.out.print("-1");
	    		return;
	    	}
	    	m*=A[i];
	    }

	    	System.out.print(m);

//        if (flg) {
//        	System.out.print("YES");
//        }else {
//        	System.out.print("NO");
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