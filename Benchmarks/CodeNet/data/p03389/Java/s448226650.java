

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	static long[][] dp;
    static int ind=1;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int[] A=new int[3];
	    
        for (int i=0; i< 3;i++) {
        	A[i]=gi();
        }
        
        Arrays.parallelSort(A);
        
        long ans=0;
        ans+=A[2]-A[1];
        if((A[1]-A[0])%2==0) {
        	ans+=(A[1]-A[0])/2;
        } else {
        	ans+=((A[1]-A[0]+1)/2) + 1;
        }

        System.out.println(ans);
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