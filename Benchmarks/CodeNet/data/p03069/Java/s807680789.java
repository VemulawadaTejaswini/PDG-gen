import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();

        int right = 0;
        int w = 0;
        int b = 0;

        if (c[n - 1] == '.') {
            // 右が白
            for (int i = n - 1; i >= 0; i--) {
                if (c[i] != '#') right = i;
            }
            int rightn = n-right;

            for (int i = 0; i < right; i++) {
                if (c[i] == '.') w++;
                else b++;
            }

            if (b + rightn == n) System.out.println(0);
            else if (w+rightn > b) System.out.println(b);
            else System.out.println(w+rightn);
        } else {
            // 右が黒
            for (int i = n - 1; i >= 0; i--) {
                if (c[i] != '.') right = i;
            }

            for (int i = 0; i <= right; i++) {
                if (c[i] == '.') w++;
                else b++;
            }

            if (w > b) System.out.println(b);
            else System.out.println(w);
        }
    }
}