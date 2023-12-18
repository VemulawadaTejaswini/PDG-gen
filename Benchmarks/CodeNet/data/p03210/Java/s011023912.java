import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int X = Integer.parseInt(sc.next());
        sc.close();

        if (X == 7 || X == 5 || X == 3) {
            out.printf("YES\n");
        } else {
            out.printf("NO\n");
        }
        out.flush();
    }
}
