


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int N=gi();
        Map<String, Integer> map=new HashMap<String, Integer>();
        
        for (int i=0; i<N; i++) {
            String s=gs();
            if(map.containsKey(s)) {
            	int k=map.get(s);
            	map.put(s, k+1);
            }else {
            	map.put(s, 1);
            }
        }
        int m=gi();

        for (int i=0; i<m; i++) {
            String s=gs();
            if(map.containsKey(s)) {
            	int k=map.get(s);
            	map.put(s, k-1);
            }else {
            	map.put(s, -1);
            }
        }
        
        int max=0;
        for (Integer v : map.values()) {
        	if(v>max) {
        		max=v;
        	}
        }

	    System.out.println(max);

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