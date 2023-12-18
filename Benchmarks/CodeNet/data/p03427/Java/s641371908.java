import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	boolean key = true;
    	for (int i = 1; i < S.length(); i++) {
    		if (S.charAt(i) != '9') {
    			key = false;
    		}
    	}
    	int count = 0;
    	if (key) {
    		count = (S.charAt(0) - '0') + (9 * (S.length()-1));
    	} else {
    		count = (S.charAt(0) - '1') + (9 * (S.length()-1));
    	}
    	System.out.println(count);
    }
}