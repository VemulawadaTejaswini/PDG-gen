import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] c = new int[n + 1];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            c[a[i]]++;
        }
        long sum = 0;
        for (int i = 0 ; i < n ; i++) {
            long d = (long) c[i] * (c[i] - 1) / 2;
            sum += d;
        }

        for (int i = 0 ; i < n ; i++) {
            System.out.println(sum - (c[a[i]] - 1));
        }


    }

}