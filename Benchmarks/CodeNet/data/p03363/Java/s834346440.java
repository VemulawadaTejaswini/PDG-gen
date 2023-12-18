

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    long[] s=new long[n+1];

	    long c=0;
	    for(int i=1; i<=n;i++) {
	    	s[i]=s[i-1]+gi();
	    }
	    
	    Arrays.parallelSort(s);

	    int m=1;
	    for (int i=1; i<=n;i++) {
            if(s[i]==s[i-1]) {
            	m++;
            } else {
            	if(m>1)c+=(m*(m-1))/2;
            	m=1;
            }
	    }
	    
	    if(m>1)c+=(m*(m-1))/2;

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