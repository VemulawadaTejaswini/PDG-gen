import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        out.println( (b-a == c-b)? "YES": "NO");
        
        
        sc.close();
    }
}