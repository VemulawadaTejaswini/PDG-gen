import java.io.*;
import java.util.Scanner;
 
public class Main {
    public static void print() {
        Scanner sc = new Scanner(System.in);
        int count = 1, i;
        while (true) {
            i = sc.nextInt();
            if (i == 0) break;
            System.out.println("Case " + count++ + ": " + i);
        }
    }
 
    public static void main (String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int W = sc.nextInt();
        // int H = sc.nextInt();
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // int r = sc.nextInt();
        print();
    }
}
