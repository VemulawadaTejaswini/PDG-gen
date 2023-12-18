import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;

        while (k > 0 && a > 0) {
            ans = ans + 1;
            k--;
            a--;
        }

        while (k > 0 && b > 0) {
            k--;
            b--;
        }

        while (k > 0 && c > 0) {
            ans = ans - 1;
            k--;
            c--;
        }

        System.out.println(ans);

    }
}
