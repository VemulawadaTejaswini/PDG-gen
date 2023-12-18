import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static PrintWriter out;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int total = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int ashikiri = a + b;
        String s = sc.next();
        int passed = 0;
        int foreigner_count = 0;
        for (int i = 0; i < total; i++) {
            if (s.charAt(i) == 'a') {
                if (passed < ashikiri) {
                    passed++;
                    out.println("Yes");
                } else {
                    out.println("No");
                }
            } else if (s.charAt(i) == 'b') {
                foreigner_count++;
                if ((passed < ashikiri) && (foreigner_count <= b)) {
                    passed++;
                    out.println("Yes");
                } else {
                    out.println("No");
                }
            } else {
                out.println("No");
            }
        }
        sc.close();
        out.close();
    }

}