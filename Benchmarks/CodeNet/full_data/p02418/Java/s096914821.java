import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
//        sc.useDelimiter("\n");

        String s = sc.next();
        String p = sc.next();
        String ss = s.concat(s);
        if (ss.indexOf(p) != -1)
            pw.println("Yes");
        else
            pw.println("No");
        
        pw.flush();
    }
}
