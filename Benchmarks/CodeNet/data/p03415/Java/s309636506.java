//package Contest090;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String str ="";
           for(int i=0;i<3;i++)
           {
               String input = sc.next();
               str+=input.charAt(i);

           }
           out.println(str);
        out.flush();
    }
}
