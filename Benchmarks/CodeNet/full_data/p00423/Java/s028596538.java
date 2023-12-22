import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int aTotal = 0;
            int bTotal = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a == b) {
                    aTotal += a;
                    bTotal += b;
                } else if (a > b) {
                    aTotal += a + b;
                } else {
                    bTotal += a + b;
                }
            }
            sb.append(aTotal).append(" ").append(bTotal).append("\n");
        }
        System.out.print(sb);
    }
}

