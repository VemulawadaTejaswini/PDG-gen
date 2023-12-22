import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        int k = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
            k = Math.max(k, num[i]);
        }
        int[] result = countingSort(num, k, n);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(result[i]);
            if (i < n - 1) builder.append(" ");
        }
        System.out.println(builder);
    }

    public static int[] countingSort(int[] num, int k, int n) {
        int[] c = new int[k + 1];
        int[] b = new int[n];
        for (int i = 0; i <= k; i++) {
            c[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            c[num[i]]++;  // 统计每个num[i]的个数
        }
        for (int i = 1; i <= k; i++) {
            c[i] += c[i - 1];  // 统计num[i]在有序数组中的位置
        }
        for (int i = 0; i < n; i++) {
            b[c[num[i]] - 1] = num[i];  // 恢复num[i]在有序数组中的位置
            c[num[i]]--;  // 从c中移除该数
        }
        return b;
    }
}

