import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0; i < b.length; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int ans = n - 1 - m;
        if(ans < 1) ans = 0;
        System.out.println(n - 1 - m);
    }
}