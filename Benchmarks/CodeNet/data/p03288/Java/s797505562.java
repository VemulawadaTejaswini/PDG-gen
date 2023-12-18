import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int R = Integer.parseInt(sc.next());
        sc.close();

        if (R < 1200) {
            out.printf("ABC\n");
        } else if (R < 2800) {
            out.printf("ARC\n");
        } else {
            out.printf("AGC\n");
        }
        out.flush();
    }
}
