import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k = sc.nextInt();
        if (k >= (1 << m)) {
            System.out.println(-1);
            return;
        }
        if (m == 1) {
            if (k == 0) {
                System.out.println("0 0 1 1");
            } else {
                System.out.println(-1);
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < (1 << m); i++) {
            if (i == k) {
                continue;
            }
            sb.append(i).append(" ");
        }
        sb.append(k).append(" ");
        for (int i = (1 << m) - 1; i >= 0; i--) {
            if (i == k) {
                continue;
            }
            sb.append(i).append(" ");
        }
        sb.append(k);
        System.out.println(sb);
     }
}