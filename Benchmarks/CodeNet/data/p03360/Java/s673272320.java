import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int work = 0;
        int ans = 0;

        work = Math.max(Math.max(a, b), c);
        if (work == a) {
            ans = b + c;
        } else if (work == b) {
            ans = a + c;
        } else {
            ans = a + b;
        }

        ans += work * 2 * k;

        System.out.println(ans);
    }
}