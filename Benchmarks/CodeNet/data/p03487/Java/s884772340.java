import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] list = new long[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLong();
        }

        if (n == 1 && list[0] != 1) {
            System.out.println(1);
            return;
        }

        Arrays.sort(list);

        long now = list[0];
        long count = 1;
        long ans = 0;

        for (int i = 1; i < n; i++) {
            if (list[i] == now) {
                count++;
                if (i == n - 1) {
                    if (count > now) {
                        ans += count - now;
                    } else if (count < now) {
                        ans += count;
                    }
                }
            } else {
                if (count > now) {
                    ans += count - now;
                } else if (count < now) {
                    ans += count;
                }
                now = list[i];
                count = 1;
            }
        }

        System.out.println(ans);
    }
}