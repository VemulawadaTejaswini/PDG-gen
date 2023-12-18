import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        if(n == 1 || m ==1) {
            if(n == m) {
                System.out.println(1);
                return;
            }
            long ans = Math.max(n, m);
            System.out.println(ans - 2);
            return;
        }
        else {
            long ans = n * m - (n + n + m + m - 4);
            System.out.println(ans);
            return;
        }
    }
}