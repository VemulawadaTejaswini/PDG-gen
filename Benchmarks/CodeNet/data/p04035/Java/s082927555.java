import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int prev = sc.nextInt();
        int idx = 0;
        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            if (prev + x >= k) {
                idx = i;
                break;
            }
        }
        if (idx == 0) {
            System.out.println("Impossible");
            return;
        }
        System.out.println("Possible");
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < idx; i++) {
            sb.append(i).append("\n");
        }
        for (int i = n - 1; i > idx; i--) {
            sb.append(i).append("\n");
        }
        sb.append(idx).append("\n");
        System.out.print(sb);
    }
}