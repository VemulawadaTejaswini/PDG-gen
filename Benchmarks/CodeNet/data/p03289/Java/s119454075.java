import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	char[] S = sc.next().toCharArray();
    	String ans = "AC";
    	boolean check = false;
    	for (int i = 0; i < S.length; i++) {
    		if (S[0] != 'A') {
    			ans = "WA";
    		} else if (1 < i && i < S.length-3 && S[i] == 'C') {
    			if (check) {
    				ans = "WA";
    			}
    			check = true;
    		} else if (i != 0 && S[i] < 97) {
    			ans = "WA";
    		}
    	}
    	System.out.println(check ? ans : "WA");
    }
}