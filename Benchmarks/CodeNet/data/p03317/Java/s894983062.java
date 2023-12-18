import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int onePlace = -1;
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            if (onePlace == -1 && a[i] == 1) onePlace = i;
        }

        int min = 100000;

        for (int i = 0 ; i < k ; i++) {
            if (onePlace >= i && onePlace <= n - k + i) {
                int tmp = 1;
                tmp += (onePlace - i) / (k - 1);
                if ((onePlace - i) % (k - 1) != 0) tmp++;

                tmp += (n - onePlace - k + i) / (k - 1);
                if ((n - onePlace - k + i) % (k - 1) != 0) tmp++;

                min = Math.min(tmp,min);
            }
        }
        System.out.println(min);
    }
}