import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
//        DecimalFormat df = new DecimalFormat("0.00000000");

        char[] ch = sc.next().toCharArray();
        boolean ans = false;
        for (int i = 0; i < ch.length; i++)
            if (ch[i] == '7') ans = true;
        out.println(ans ? "Yes" : "No");
        out.flush();
    }
}