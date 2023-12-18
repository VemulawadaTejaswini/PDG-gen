import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] A = {"dream", "dreamer", "erase", "eraser"};

        StringBuffer sb;
        S = new StringBuffer(S).reverse().toString();

        for (int i = 0; i < A.length; i++) {
            sb = new StringBuffer(A[i]);
            A[i] = sb.reverse().toString();
        }

        int index = 0;
        while (index < S.length()) {
            boolean f = false;
            for (int i = 0; i < 4; i++) {
                if (S.substring(index, Math.min(index + A[i].length(), S.length())).equals(A[i])) {
                    f = true;
                    index += A[i].length();
                    break;
                }
            }
            if (!f) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
