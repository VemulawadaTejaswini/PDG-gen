import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String A = sc.next();
    	String B = sc.next();
    	String ans = "EQUAL";
    	if (A.length() < B.length()) {
    		ans = "LESS";
    	} else if (B.length() < A.length()) {
    		ans = "GREATER";
    	} else {
    		for (int i = 0; i < A.length(); i++) {
    			if (A.charAt(i) < B.charAt(i)) {
    				ans = "LESS";
    				break;
    			} else if (B.charAt(i) < A.charAt(i)) {
    				ans = "GREATER";
    				break;
    			}
    		}
    	}
    	System.out.println(ans);
    }
}