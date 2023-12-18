import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        sc.close();

        if (A <= X && X <= A + B) {
            out.printf("YES\n");
        }
        else {
            out.printf("NO\n");
        }
        out.flush();
    }
}
