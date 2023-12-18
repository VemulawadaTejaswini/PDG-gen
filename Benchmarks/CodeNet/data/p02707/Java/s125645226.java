import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    int[] a= new int[n-1];
	    
	    for (int i=0; i<n-1; i++) {
	    	a[i]=gi();
	    }
	    
	    int[] b=new int[n];
	    for (int i=0; i<n-1; i++) {
	    	b[a[i] - 1]++;
	    }

	    for (int i=0; i<n; i++) {
	    	System.out.println(b[i]);
	    }
        //System.out.println(Math.pow(l/3, 3));
//        if (a<b) {
//        	System.out.print(Math.max(b-a-w, 0));
//        }else {
//        	System.out.print(Math.max(a-b-w, 0));
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