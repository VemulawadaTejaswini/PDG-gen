
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int n=gi();
        int[] L=new int[n];
        for (int i=0; i<n;i++) {
        	L[i]=gi();
        }
        Arrays.parallelSort(L);
        int s=0;
        for (int i=0; i<n-1;i++) {
        	s+=L[i];
        }
	    //System.out.println(i);

        if (s>L[n-1]) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
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