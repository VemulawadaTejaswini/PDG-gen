import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        
        if (str.charAt(n-1) == 3) System.out.println("bon");
        else if (str.charAt(n-1) == 0 || str.charAt(n-1) == 1 || str.charAt(n-1) == 6 || str.charAt(n-1) == 8) System.out.println("pon");
        else System.out.println("hon");
        
    }
}