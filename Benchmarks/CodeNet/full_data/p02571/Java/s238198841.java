import java.util.*;

public class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	char[] s = sc.next().toCharArray();
    	char[] t = sc.next().toCharArray();
    	int min = Integer.MAX_VALUE;
    	for (int i = 0; i + t.length <= s.length; i++) {
    	    int count = 0;
    	    for (int j = 0; j < t.length; j++) {
    	        if (s[i + j] != t[j]) {
    	            count++;
    	        }
    	    }
    	    min = Math.min(min, count);
    	}
    	System.out.println(min);
    }
}
