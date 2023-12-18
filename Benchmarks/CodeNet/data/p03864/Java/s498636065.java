
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int x=gi();
	    int[] a=new int[N];

	    int c=0;
	    for (int i=0; i<N;i++) {
	    	a[i]=gi();
	    	if(i>0) {
	    		int y=a[i-1]+a[i];
	    		if(y>x) {
	    			int d=y-x;
	    			c+=d;
	    			a[i]=Math.max(a[i]-d, 0);
	    		}
	    	}
	    }

	    System.out.println(c);
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