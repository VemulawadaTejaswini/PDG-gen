//package Contest042;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static  void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
            int n = sc.nextInt();
            out.println(( (n*(n+1))/2));
        out.close();
    }
}
