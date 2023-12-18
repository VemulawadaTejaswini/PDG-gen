import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        int X, A, B;

        X = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();

        if (B <= A) {
            out.println("delicious");
        } else if (B > A + X) {
            out.println("dangerous");
        } else {
            out.println("safe");
        }
        
        
        sc.close();
    }
}