import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            int[] arr = new int[n];
            int max = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    int sum = arr[i] + arr[j];
                    if (sum > m) {
                        continue;
                    }
                    max = Math.max(max, sum);
                }
            }
            if (max == 0) {
                sb.append("NONE").append("\n");
            } else {
                sb.append(max).append("\n");
            }
        }
        System.out.print(sb);
    }
}

