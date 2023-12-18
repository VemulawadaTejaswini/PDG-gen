//package Contest089;

import java.awt.print.Printable;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        out.println(n/3);

        out.flush();
    }
}
