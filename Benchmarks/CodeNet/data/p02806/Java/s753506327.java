
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int N=gi();
        String[] s=new String[N];
        int[] t=new int[N];
        for (int i=0;i<N;i++) {
        	s[i]=gs();
        	t[i]=gi();
        }
        String X=gs();
        int m=0;
        boolean f=false;
        for (int i=0;i<N;i++) {
        	if(f)m+=t[i];
        	if (X.equals(s[i])) {
        		f=true;
        	}
        }

        System.out.print(m);

//        if (s>L[n-2]) {
//        	System.out.println("Yes");
//        }else {
//        	System.out.println("No");
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