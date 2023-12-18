import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int maxKey = 0;
        double maxVal = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            if (maxVal <= (double) a[i] / b[i]) {
                maxKey = i;
                maxVal = (double) a[i] / b[i];
            }
        }
        long ans = (long) Math.ceil((double) (h - a[0]) / a[maxKey]) * b[maxKey] + b[0];
        for (int i = 1; i < n; i++) {
            ans = Math.min(ans, (long) Math.ceil((double) (h - a[i]) / a[maxKey]) * b[maxKey] + b[i]);
        }
        System.out.println(ans);
    }

}
