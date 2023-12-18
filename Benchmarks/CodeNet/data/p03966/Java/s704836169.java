
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();

	    long c1=1;
	    long c2=1;

	    for (int i=0; i<N;i++) {
	    	int t=gi();
	    	int a=gi();
	        long a1=(long)Math.ceil((double)c1/(double)t);
	        long a2=(long)Math.ceil((double)c2/(double)a);
	        if(a1>a2) {
	        	c1=t*a1;
	        	c2=a*a1;
	        } else {
	        	c1=t*a2;
	        	c2=a*a2;
	        }
	    }



	    System.out.println(c1+c2);
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