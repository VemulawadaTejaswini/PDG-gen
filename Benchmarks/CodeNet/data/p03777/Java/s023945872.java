import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
      	String a, b;
      
        a = sc.next();
        b = sc.next();

        if (a.equals(b)) 
        {
            out.println("H");
        } else {
            out.println("D");
        }

        sc.close();
    }
}