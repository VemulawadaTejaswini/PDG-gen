import java.io.*;
import java.util.*;

public class Main {
    Scanner sc;
    int n, m;
    Set<String> key = new HashSet<String>();
    boolean open;

    Main() {
        sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) 
            key.add(sc.next());
        m = sc.nextInt();
        open = false;
    } 

    void println(Object s) {
        System.out.println(s);
    }

    void run() {
        for (int i = 0; i < m; i++) {
            String s = sc.next();
            if (key.contains(s)) {
                if (open) {
                    println("Closed by " + s);
                    open = false;
                } else {
                    println("Opened by " + s);
                    open = true;
                }
            } else {
                println("Unknown " + s);
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}            