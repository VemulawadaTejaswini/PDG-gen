import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main (String args[]) {
        
        String ans = "";

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 25) {
            ans = "Christmas";
        } else if (n == 24) {
            ans = "Christmas Eve";
        } else if (n == 23) {
            ans = "Christmas Eve Eve";
        } else {
            ans = "Christmas Eve Eve Eve";
        }
	    
        System.out.println(ans);
    }
}
