import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       int a, b;
       a = in.nextInt();
       b = in.nextInt();
       int d = a/b;
       int r = a%b;
       double f = (double)a / b;
       System.out.printf("%d %d %f\n", d, r, f);
    }
}