import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        sc.close();

        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = -10; i < 10; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Math.abs(a[j] - (i + j));
            }
            ans = Math.min(ans, sum);
        }

        System.out.println(ans);

    }

}