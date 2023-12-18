import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i + 1) == (S.charAt(i))) {
                out.println("NO");
                sc.close();
                out.flush();
                return;
            }
        }

        String[] s = S.split("A");
        String kihbr = "";

        for (int i = 0; i < s.length; i++) {
            kihbr += s[i];
        }

        if (kihbr.equals("KIHBR")) {
            out.println("YES");
        } else {
            out.println("NO");
        }

        sc.close();
        out.flush();
    }
}