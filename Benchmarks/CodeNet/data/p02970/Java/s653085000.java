import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int t = 2 * d + 1;
        int sum = 0;
        for (int i = 0;i<n;i++) {
            sum = i * t;
            if (sum >= n) {
                System.out.println(i);
                return;
            }
        }
    }
}
