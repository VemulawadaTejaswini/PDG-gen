
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long[] A= new long[N];
	    
        for(int i=0; i<N;i++) {
            A[i]=gl();
	    }
	    
        long v=1;
        long b=A[0];
        int f=0;
        for(int i=1; i<N;i++) {
            long a=A[i];
        	if(a<b) {
        		if(f<0) { 
        			v++;
        			f=0;
        		} else {
        		    f=1;
        		}
        	} else if(a>b) {
        		if(f>0) {
        			v++;
        			f=0;
        		} else {
        		    f=-1;
        		}
        	}
        	b=a;
	    }
	    
		System.out.println(v);
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