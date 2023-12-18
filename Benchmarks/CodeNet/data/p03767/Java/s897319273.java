
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long[] A= new long[3*N];
        for(int i=0; i<3*N;i++) {
            A[i]=gl();
	    }
	    
        Arrays.parallelSort(A);
        
        int l=0;
        int r=3*N-2;
        long v=0;
        while(l<r) {
            v+=A[r];
            l++;
            r-=2;
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