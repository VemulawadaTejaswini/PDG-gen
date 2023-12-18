//intのオーバーフローに気をつけろ,AGCはだいたいlongにしておけ
//nextLineよりnextだ
//読み込みは先に全部やっておけ

import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);

		    String s = sc.next();
		    String t = sc.next();
		    int count = 0;
		    int counter = 0;
		    
		    for(int i = 0; i < s.length()-t.length(); i++) {
		    	
		    	for(int j = 0; j < t.length(); j++) {
		    		if(s.substring(s.length()-t.length()+j-i, s.length()-t.length()+j-i+1)
		    				.equals(t.substring(j, j+1)) ||
		    				s.substring(s.length()-t.length()+j-i, s.length()-t.length()+j-i+1).equals("?")) {
		    			count++;
		    		}
		    	}
		    	
		    	if(count == t.length()) {
		    		s = s.substring(0,s.length()-t.length()-i) + t + s.substring(s.length()-i);
		    		counter++;
		    		break;
		    	}else {
		    		count = 0;
		    		continue;
		    	}
		    }
		    if(counter == 0) {
		    	System.out.println("UNRESTORABLE");
		    }else {
		    	s = s.replace("?", "a");
		    	System.out.println(s);
		    }
		    
		    
		    
		    sc.close(); }

	public static  int gcd(int a, int b) {
	    if (a < b) {
	        int tmp = a;
	        a = b;
	        b = tmp;
	    }

	    int r = -1;
	    while (r != 0) {
	        r = a % b;
	        a = b;
	        b = r;
	    }

	    return a;
	}
}
