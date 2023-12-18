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

        int avg1 = 0;
        int avg2 = 0;
        avg1 = (int) Math.ceil((double) sum / N);
        avg2 = (int) Math.floor((double) sum / N);

        int cost1 = 0;
        int cost2 = 0;
        for (int i = 0; i < a.length; i++) {
            cost1 += (a[i] - avg1) * (a[i] - avg1);
            cost2 += (a[i] - avg2) * (a[i] - avg2);
        }

        System.out.println(Math.min(cost1, cost2));
        sc.close();
    }
}