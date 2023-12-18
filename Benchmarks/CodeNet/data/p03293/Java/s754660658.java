import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	String T = sc.next();
    	String ans = "No";
    	for (int i = 0; i < S.length(); i++) {
    		S = S.substring(1, S.length()) + S.substring(0, 1);
    		if (S.equals(T)) {
    			ans = "Yes";
    		}
    	}
    	System.out.println(ans);
    }
}