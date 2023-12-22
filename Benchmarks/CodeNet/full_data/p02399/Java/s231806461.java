import java.io.*;
import java.util.Scanner;
 
public class Main {
    public static int divide(int a, int b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static double dividef(int a, int b) {
        return 1.0 * a / b;
    }
 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d %d %f", divide(a,b), remainder(a,b),dividef(a,b));
    }
}
