import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        double ans = 0.0;
        for(int i=0; i<n; i++) {
            ans += 1.0 / (double)sc.nextDouble();
        }
        System.out.println(1 / ans);
    }
}