
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int[] A=new int[N];
	    for (int i=0; i<N;i++) {
	    	A[i]=gi();
	    }
	    
	    long m=1000;
	    long b=A[0];
	    long kabu=0;
	    for (int i=1; i<N;i++) {
	    	if(kabu==0) {
	    		if(b<A[i]) {
	    			long k=(long)Math.floorDiv(m, b);
	    			kabu+=k;
	    			m-=k*b;
	    		}
	    	} else {
	    		if(b>A[i]) {
	    			m+=kabu*b;
	    			kabu=0;
	    		}
	    	}
	    	b=A[i];
	    }
	    
	    m+=kabu*A[N-1];

	    System.out.println(m);
//
//	    if(A<B && B<C) {
//	        System.out.println("Yes");
//	    } else {
//	    	System.out.println("No");
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