import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();

        int t[] = new int[N + 1];
        t[0] = 0;
        for (int i = 1; i <= N; i++) {
            t[i] = L + i - 1;
        }

        int index = -1;
        int min = 10000;
        for (int i = 1; i <= N; i++) {
            if (min > Math.abs(t[i])) {
                min = Math.abs(t[i]);
                index = i;
            }
        }

        int res = 0;
        for (int i = 1; i <= N; i++) {
            if (i == index) continue;
            res += t[i];
        }

        System.out.println(res);
    }
}