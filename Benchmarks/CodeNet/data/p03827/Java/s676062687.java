import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	String S = sc.next();
    	int x = 0;
    	int max = 0;
    	for (char c : S.toCharArray()) {
    		if (c == 'I') {
    			x++;
    		} else if (c == 'D') {
    			x--;
    		}
    		if (max < x) {
    			max = x;
    		}
    	}
    	System.out.println(max);
    }
}
