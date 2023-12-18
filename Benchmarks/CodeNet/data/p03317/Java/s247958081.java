import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        double tmp = (n - 1.0) / (k - 1.0);
        int ans = (int) Math.ceil(tmp);
        System.out.println(ans);
    }
}