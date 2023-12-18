import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = sc.next();
        final String T = sc.next();

        s += s;
        
        out.println(s.contains(T) ? "Yes" : "No");
        
        out.flush();
    }
}