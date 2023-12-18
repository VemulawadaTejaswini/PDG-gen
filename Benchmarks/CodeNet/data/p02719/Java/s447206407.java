import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner s = new Scanner(System.in);
        double n = Double.parseDouble(s.next());
        double k = Double.parseDouble(s.next());

        long result = (long)Math.min(n%k, k - n%k);
      	
      	System.out.println(result);
    }
}