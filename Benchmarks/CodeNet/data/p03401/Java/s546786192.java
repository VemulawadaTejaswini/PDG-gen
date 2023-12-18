import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        long sum = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            sum += Math.abs(x - temp);
            a[i] = temp;
            x = temp;
            if (i == n - 1) {
                sum += Math.abs(temp);
            }
        }
        long[] ans = new long[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans[i] = sum - Math.abs(a[i]) - Math.abs(a[i + 1] - a[i]) + Math.abs(a[i + 1]);
            } else if (i == n - 1) {
                ans[i] = sum - Math.abs(a[i] - a[i - 1]) - Math.abs(a[i]) + Math.abs(a[i - 1]);
            } else {
                ans[i] = sum - Math.abs(a[i] - a[i - 1]) - Math.abs(a[i + 1] - a[i]) + Math.abs(a[i + 1] - a[i - 1]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (long l : ans) {
            sb.append(l);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}