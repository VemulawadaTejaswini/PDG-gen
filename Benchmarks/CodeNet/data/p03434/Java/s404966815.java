
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int N=gi();
        int[] A=new int[N];
        
        
        int al=0;
        int bo=0;
        for (int i=0; i<N; i++) {
            A[i]=gi();
        }
        
        Arrays.sort(A);

        for (int i=0; i<N; i++) {
            if (i%2==0) {
            	al+=A[N-i-1];
            } else {
            	bo+=A[N-i-1];
            }
        }
        
	    System.out.println(al-bo);

//	    if (isNumber(s1) && isNumber(s2) && s.charAt(a) == '-') {
//	    	System.out.print("Yes");
//	    }else {
//	    	System.out.print("No");
//	    }



	}

	public static long d(long n) {
		String a=String.valueOf(n);
		return (long)a.length();
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