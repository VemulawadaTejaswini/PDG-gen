import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] rb = new int[N + 1];
        int[] ht = new int[N];
        for (int i = 0; i < N; ++i) {
            rb[i + 1] = sc.nextInt();
        }
        sc.close();

        int res = 0;
        for (int i = 1; i <= N; ++i) {
            if (ht[i - 1] == 1 && ht[rb[i] - 1] ==  1) continue;
            if (i == rb[rb[i]]) {
                res++;
            }
            ht[i - 1] = 1;
            ht[rb[i] - 1] = 1;
        }

        System.out.println(res);
    }
}