
import java.util.Arrays;
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
	    
	    Arrays.parallelSort(A);
	    
	    if(N%2==0) {
	    	for (int i=0; i<N;i++) {
		    	if (A[i]!=Math.floorDiv(i+2, 2)*2-1) {
		    		System.out.println(0);
		    		return;
		    	}
		    }
	    } else {
	    	for (int i=0; i<N;i++) {
		    	if (A[i]!=Math.floorDiv(i+1, 2)*2) {
		    		System.out.println(0);
		    		return;
		    	}
		    }
	    }
	    
	    long a=1;
        long nn=Math.floorDiv(N,2);
	    while(nn>0) {
	    	a*=2;
	    	a=a%100000007;
	    	nn--;
	    }
	    System.out.println(a);
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