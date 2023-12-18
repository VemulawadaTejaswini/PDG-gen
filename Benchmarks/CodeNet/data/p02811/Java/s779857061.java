import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner s = new Scanner(System.in);
        int k = Integer.parseInt(s.next());
        int x = Integer.parseInt(s.next());
        
        if (k*500 < x) System.out.println("No");
        else System.out.println("Yes");
    }
}