import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int steps1 = 0;
        int steps2 = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(i % 2 == 0) {
        		if(s.charAt(i) != '1')
        			steps1++;
        		else
        			steps2++;
        	} else {
        		if(s.charAt(i) != '1')
        			steps2++;
        		else
        			steps1++;
        	}
        }

    	System.out.println(Math.min(steps1, steps2));
    }
}