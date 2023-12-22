import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        ans = Math.min(a, k);
        k = k - a;
        if(k <= 0) {
            System.out.println(ans);
            return;
        }
        k = k - b;
        if(k <= 0) {
            System.out.println(ans);
            return;
        }
        k = Math.min(c, k);
        System.out.println(ans - k);
    }
}