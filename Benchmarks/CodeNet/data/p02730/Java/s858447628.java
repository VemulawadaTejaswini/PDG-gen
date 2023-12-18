import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {

    	Scanner s = new Scanner(System.in);
    	String zString = s.next();
    	int n = zString.length();
    	if (o(zString) && o(zString.substring(0, (n - 1) / 2)) && o(zString.substring((n+3)/2 - 1))) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    	}
   static boolean o(String s) {
    	return new StringBuilder(s).reverse().toString().equals(s);
    }

    }
