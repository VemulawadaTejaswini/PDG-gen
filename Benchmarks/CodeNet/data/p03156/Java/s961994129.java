
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int A=gi();
	    int B=gi();
	    int[] P=new int[N];
	    int s=0;
	    int m=0;
	    int l=0;
	    for (int i=0; i<N;i++) {
	    	P[i]=gi();
	    	if(P[i]<=A) {
	    		s++;
	    	} else if(P[i]<=B) {
	    		m++;
	    	} else {
	    		l++;
	    	}
	    }
	    

        System.out.println(Math.min(s, Math.min(m, l)));
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