//package Contest066;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter (System.out);
            int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
            out.println(Math.min((a+b),Math.min(b+c,a+c)));


        out.flush();
    }
}
