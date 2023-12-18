import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // x * 1.08 = n;
        int start = (int) (n / 1.08) - 1;
        int ans = 0;
        for (; start < n; start++) {
            int tmp = (int) (start * 1.08);
            if (tmp == n) {
                ans = start;
            }
            if (tmp > n) {
                break;
            }
        }

        if (ans == 0) {
            System.out.println(":(");
        } else {
            System.out.println(ans);
        }
    }
}
