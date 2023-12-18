
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        if (k > n)
        {
            System.out.print(n);
            return;
        }

        if (k == 1)
        {
            System.out.print(0);
            return;
        }

        int count = n / k;

        int biggerK = k * (count + 1);
        int smallerK = k * (count);
        int ans = Math.min(Math.abs(n - biggerK), Math.abs(n - smallerK));
        System.out.print(ans);

    }
}
