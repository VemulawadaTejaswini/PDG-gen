import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        sc.close();

        out.printf("%d\n", Math.max(Math.max(A + B, A - B), A * B));
        out.flush();
    }
}
