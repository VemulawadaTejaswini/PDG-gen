import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int tmpA = i;
            int tmpB = n - tmpA;

            int tmpSum = digitsSum(tmpA) + digitsSum(tmpB);
            if (ans > tmpSum) ans = tmpSum;
        }

        System.out.println(ans);
    }

    private static int digitsSum(int num) {
        int ans = 0;
        while (num > 0) {
            ans = ans + (num % 10);
            num /= 10;
        }

        return ans;
    }
}
