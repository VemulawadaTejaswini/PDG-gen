// int型のオーバーフローに注意
// 文字列の比較は==ではなく.equalsを使おう
// Stringの入力はnext();が丸い

import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);


		    String s = sc.next();
		    String t = sc.next();
		    int count = 0;
		    
		    for(int i = s.length()-t.length(); i > 0; i--) {
		    	count = 0;
		    	for(int j = 0; j < t.length(); j++) {
		    		if(s.substring(i+j, i+j+1).equals(t.substring(j, j+1))) {
		    			count++;
		    		}else if(s.substring(i+j,i+j+1).equals("?")) {
		    			count++;
		    		}
		    		if(count == t.length()) {
		    			s = s.substring(0,i) + t;
		    			System.out.println(s);
		    			break;
		    		}
		    	}
		    	if(count == t.length()) {
		    		break;
		    	}
		    }
		    for(int i = 0; i < s.length(); i++) {
		    	if(s.substring(i,i+1).equals("?")) {
		    		s = s.substring(0,i) + "a" + s.substring(i+1);
		    	}
		    }
		    if(count == t.length()) {
		    	System.out.println(s);
		    }else {
		    	System.out.println("UNRESTORABLE");
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
