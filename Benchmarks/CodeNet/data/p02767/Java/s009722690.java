import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] xa = new int[n];
        for (int i = 0; i < n; i++) {
            xa[i] = sc.nextInt();
            sum += xa[i];
        }
        long p = Math.round((double) sum / n);
        int ans = 0;
        for (int x : xa) {
            ans += Math.pow((x - p), 2);
        }
        System.out.println(ans);
    }
}