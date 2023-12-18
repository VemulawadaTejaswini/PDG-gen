import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i + 1] = in.nextInt();
        }
        int[] c1 = new int[n + 1], c2 = new int[n+1];
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            c1[i] = Math.abs(a[i] - a[i + 1]);
            c2[i] = Math.abs(a[i] - a[i + 2]);
//            System.out.println(c2[i]);
            sum += c1[i];
        }
        c1[n-1] = Math.abs(a[n-1] - a[n]);
        c1[n] = Math.abs(a[n]);
        c2[n-1] = Math.abs(a[n-1]);
        sum += c1[n - 1];sum += c1[n];
//        System.out.println("sum = " + sum);
        for (int i = 0; i < n; i++) {
            System.out.println(sum - c1[i] - c1[i + 1] + c2[i]);
        }
    }
}
