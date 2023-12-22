import java.io.*;
import java.util.Scanner;
 
public class Main {
    public static boolean range(int a, int b, int c) {
        if (a >= b) return false;
        if (b >= c) return false;
        return true;
    }
 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (range(a, b, c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
