import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        int A, B, C;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        if (A <= C && C <= B) {
            out.println("Yes");
        } else {
            out.println("No");
        }
        
        sc.close();
    }
}