import java.util.*;

public class Main {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
      
        String d = sc.next();
        if (d.equals("Christmas")) {
            System.out.println(25);
        } else if (d.equals("Christmas Eve")) {
        	System.out.println(24);
        } else if (d.equals("Christmas Eve Eve")) {
            System.out.println(23);
        } else if (d.equals("Christmas Eve Eve Eve")) {
        	System.out.println(22);
        }
    }
}
