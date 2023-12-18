import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        boolean winT = false;
        for (int i = 0; i < 100; i++) {
            c -= b;
            if (c <= 0) {
                winT = true;
                break;
            }
            a -= d;
            if (a <= 0) {
                winT = false;
                break;
            }

        }
        System.out.println(winT?"Yes":"No");
    }
}
