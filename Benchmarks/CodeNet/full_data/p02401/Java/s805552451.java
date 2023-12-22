import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        String op;
        while (true) {
            a = scan.nextInt();
            op = scan.next();
            b = scan.nextInt();

            if (op.equals("?"))
                return;
            else if (op.equals("+")) {
                System.out.println(a + b);
            } else if (op.equals("-")) {
                System.out.println(a - b);
            } else if (op.equals("*")) {
                System.out.println(a * b);
            } else if (op.equals("/")) {
                System.out.println(a / b);
            } else
                return;
        }
    }
}
