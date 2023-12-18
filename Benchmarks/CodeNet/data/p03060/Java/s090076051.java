import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] c = new int[n];
        int sum = 0;
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();

        }

        for (int i = 0 ; i < n ; i++) {
            c[i] = sc.nextInt();
        }

        for (int i = 0 ; i < n ; i++) {
            int d = a[i] - c[i];
            if (d > 0) {
                sum += d;
            }
        }
        System.out.println(sum);

    }

}
