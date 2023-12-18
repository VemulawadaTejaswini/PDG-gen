

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

	    int K=gi();
	    int s=0;
        for(int i=1; i<=K; i++) {
        	for(int j=1; j<=K; j++) {
        		int u1=uclid(i,j);
        		for(int k=1; k<=K; k++) {
                	int u=uclid(u1,k);
                	s+=u;
                }
            }
        }
        

        System.out.print(s);

//        if (b>=1 && b<=12) {
//        	if(a>=1 && a<=12) {
//        	    System.out.println("AMBIGUOUS");
//        	} else {
//        		System.out.println("MMYY");
//        	}
//        }else {
//        	if(a>=1 && a<=12) {
//        	    System.out.println("YYMM");
//        	} else {
//        		System.out.println("NA");
//        	}
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