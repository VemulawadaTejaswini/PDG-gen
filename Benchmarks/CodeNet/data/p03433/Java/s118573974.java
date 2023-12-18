//package Contest088;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String []args)
    {
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),a=sc.nextInt();
        if(n%500<=a)
            out.println("Yes");
        else
            out.println("No");

        out.flush();
    }
}
