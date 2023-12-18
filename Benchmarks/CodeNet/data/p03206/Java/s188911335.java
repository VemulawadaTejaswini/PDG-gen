import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int D = Integer.parseInt(sc.next());
        sc.close();

        String ans = "Christmas";
        for (int i  = 24; i >= D; i--) {
            ans += " Eve";
        }
        out.printf("%s\n", ans);
        out.flush();
    }
}
