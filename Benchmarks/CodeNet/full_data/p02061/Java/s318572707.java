import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sums = new int[100001];
        for (int i = 2; i < sums.length; i++) {
            sums[i] = sums[i - 1];
            int count = 0;
            for (int j = 2; j <= Math.sqrt(i) && count < 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count >= 2) {
                sums[i]++;
            }
        }
        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            sb.append(sums[sc.nextInt()]).append("\n");
        }
        System.out.print(sb);
    }
}

