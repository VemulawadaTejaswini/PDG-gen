import java.util.Scanner;

/**
 * ABC043C
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] a = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        int avg = (int)Math.ceil((double)sum / N);

        int cost = 0;
        for (int i = 0; i < a.length; i++) {
            cost += (a[i] - avg) * (a[i] - avg);
        }

        System.out.println(cost);
        sc.close();
    }
}