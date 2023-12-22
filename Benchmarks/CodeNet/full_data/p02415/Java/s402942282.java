import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        sc.useDelimiter("\n");
        char[] ch = new char[1200];
        ch = sc.next().toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLowerCase(ch[i]))
                pw.print(Character.toUpperCase(ch[i]));
            else if (Character.isUpperCase(ch[i]))
                pw.print(Character.toLowerCase(ch[i]));
            else
                pw.print(ch[i]);
        }
        pw.println();
        
        pw.flush();
    }
}
