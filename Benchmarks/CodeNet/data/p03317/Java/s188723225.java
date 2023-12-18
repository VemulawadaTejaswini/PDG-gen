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
        int tmp = n % (k - 1);
        int ans = n / (k - 1);
        if(n == k) {
            System.out.println(1);
            return;
        }
        if(tmp == 0) {
            System.out.println(ans);
        } else {
            System.out.println(ans + 1);
        }
    }
}