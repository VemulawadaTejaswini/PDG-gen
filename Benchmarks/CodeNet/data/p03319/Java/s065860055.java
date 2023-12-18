

import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int K=gi();
	    int[] A=new int[N];

	    int min=Integer.MAX_VALUE;
	    int mi=0;
        for(int i=0; i<N;i++) {
        	A[i]=gi();
        	if(min>A[i]) {
        		min=A[i];
        		mi=i;
        	}
        }

        int s=0;
        int e=N-1;
        if(mi==s)s=1;
        if(mi==e)e=e-1;

        if(e-s<K) {
        	System.out.println(1);
        } else {
        	int n=0;
        	if(mi>s)n+=Math.ceil((double)(mi-s)/ (double)(K-1));
        	mi=mi+((mi-s)%(K-1));
        	if(mi<e)n+=Math.ceil((double)(e-mi)/ (double)(K-1));
        	System.out.println(n);
        }

		//System.out.println();
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