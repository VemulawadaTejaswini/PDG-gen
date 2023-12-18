import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        sc.close();

        int ans = 0;
        double diff = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            double temp = t - h[i] * 0.006;
            double abs = Math.abs(temp - a);
            if (abs < diff) {
                diff = abs;
                ans = i + 1;
            }
        }
        System.out.println(ans);
    }

}
