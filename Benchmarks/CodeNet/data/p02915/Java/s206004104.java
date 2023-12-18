import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        sc.close();

        int cnt = 0;
        cnt = (int)Math.pow(N, 3);

        PrintWriter out = new PrintWriter(System.out);
        out.println(cnt);
        out.flush();
    }
}