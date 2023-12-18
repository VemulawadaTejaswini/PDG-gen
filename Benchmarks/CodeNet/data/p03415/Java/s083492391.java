//package Contest090;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
            String str1 = sc.next();
            String str2 = sc.next();
            String str3 = sc.next();
            out.println(str1.charAt(0)+str2.charAt(1)+str3.charAt(2));
        out.flush();
    }
}
