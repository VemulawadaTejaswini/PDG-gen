import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String args[]){
        
        int ans = 0;
	int len = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	String s;

	for (int i = 0; i <= n; i++) {
	    boolean is753 = true;
	    boolean three = false;
	    boolean five = false;
	    boolean seven = false;
	    s = String.valueOf(i);
	    len = s.length();
	    for (int j = 0; j < len; j ++) {
		char c = s.charAt(j);
		if (c == '3') {
		    three = true;
		} else if (c == '5') {
		    five = true;
		} else if (c == '7') {
		    seven = true;
		} else {
		    is753 = false;
		    break;
		}
	    }
	    if (is753 && three && five && seven) {
		ans ++;
	    }
	}
	    
        System.out.println(ans);
    }
}
