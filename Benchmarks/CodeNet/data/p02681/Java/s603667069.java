import java.utiimport java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner sc = new Scanner(System.in);
        String s = sc.next();
      	String t = sc.next();
        
        if (t.startsWith(s) && s.length() == t.length()-1) System.out.println("Yes");
      	else System.out.println("No");
    }
}