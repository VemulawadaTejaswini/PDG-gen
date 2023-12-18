
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int K=gi();
	    int[] X=new int[N];
	    
	    for(int i=0; i<N;i++) {
	    	X[i]=gi();
	    }

	    int min=Integer.MAX_VALUE;
    	for(int i=0; i<N-K+1;i++) {
	    	int a=X[i];
	    	int b=X[i+K-1];
	    	int c=0;
	    	if (a>=0) {
	    		c=b;
	    	} else if(b<=0) {
	    		c=Math.abs(a);
	    	} else {
	    		c=Math.min(Math.abs(a), Math.abs(b))*2 + Math.max(Math.abs(a), Math.abs(b)); 
	    	}
	    	
	    	if (min>c) {
	    		min=c;
	    	}
	    }
	    System.out.print(min);
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