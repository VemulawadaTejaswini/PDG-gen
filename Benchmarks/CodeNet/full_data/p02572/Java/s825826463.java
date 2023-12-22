import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += array[i];
            sum %= (long)1000000007;
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans += (long)(sum - array[i]) * (long)array[i];
            ans %= (long)1000000007;
        }

        System.out.println(ans / 2);

        sc.close();

        }

    }

