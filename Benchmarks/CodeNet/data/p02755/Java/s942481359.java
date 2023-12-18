
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int A=gi();
	    int B=gi();
	    int x=-1;
	    for (double i=1; i<=1000; i++) {
	    	if((Math.floor(i*0.08) == A) && (Math.floor(i*0.1)==B)) {
	    		x=(int)i;
	    		break;
	    	}
	    }

        System.out.print(x);

//        if (b>c) {
//        	System.out.println(c);
//        }else {
//        	System.out.println(b);
//        }
	}
	
	// ユークリッドの互除法
    public static int uclid(int m, int n) {
    	if (m<n) {
			m^=n;
			n^=m;
			m^=n;
		}

		while(true) {
			int t=m%n;
			if (t==0) {
				return n;
			} else {
				m=n;
				n=t;
			}
		}
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