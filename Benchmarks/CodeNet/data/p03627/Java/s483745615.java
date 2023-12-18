

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
        Map<Long, Integer> map=new TreeMap<>(Collections.reverseOrder());

	    for(int i=0; i<N; i++) {
	        long a=gl();
	        if(map.containsKey(a)) {
	        	map.put(a, map.get(a)+1);
	        } else {
	        	map.put(a, 1);
	        }
	    }
	    
	    long x=0;
	    long y=0;
	    for(Map.Entry<Long, Integer> e : map.entrySet()) {
	    	int v=e.getValue();
	    	if(v>1) {
	    		if(x==0) {
	    			x=e.getKey();
	    			if(v>3) {
	    				y=e.getKey();
	    				break;
	    			}
	    		} else {
	    			y=e.getKey();
	    			break;
	    		}
	    	}
	    }

		System.out.println(x*y);
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