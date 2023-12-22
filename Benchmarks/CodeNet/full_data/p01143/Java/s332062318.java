import java.util.*;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int p = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[] arr = new int[n + 1];
            int total = 0;
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
                total += arr[i] * 100;
            }
            total = total * (100 - p) / 100;
            if (arr[m] == 0) {
                sb.append(0).append("\n");
            } else {
                sb.append(total / arr[m]).append("\n");
            }
        }
        System.out.print(sb);
    }
}
