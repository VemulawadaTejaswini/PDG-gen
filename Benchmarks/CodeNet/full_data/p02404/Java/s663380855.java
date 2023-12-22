import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int H = sc.nextInt();
            int W = sc.nextInt();

            if (H == 0 && W == 0)
                break;

            p('#', W);
            pln();
            for (int n = H - 2; n > 0; n--) {
                p('#');
                p('.', W - 2);
                p('#');
                pln();
            }
            p('#', W);
            pln();
            pln();
        }
    }
    private static void p(char c, int n) {
        while (n-- > 0)
            System.out.print(c);
    }
    private static void p(char c) {
        p(c, 1);
    }
    private static void pln() {
        System.out.println();
    }
}
