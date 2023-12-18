import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(i == k - 1 ? Character.toLowerCase(s.charAt(i)) : s.charAt(i));
        }

        System.out.println(sb.toString());
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
