import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            if (sum >= n) {
                long gap = sum - n;
                for (int j = 1; j <= i; j++) {
                    if (gap == j) {
                        continue;
                    }
                    System.out.println(j);
                }
                return;
            }
        }
    }
}