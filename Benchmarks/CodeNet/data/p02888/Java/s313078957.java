import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int N = sc.nextInt();
        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }
        Arrays.sort(L);
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int l = j, r = N;
                while(r - l > 1) {
                    int m = (l + r) / 2;
                    if(L[m] < L[i] + L[j]) l = m;
                    else r = m;
                }
                ans += l - j;
            }
        }
        System.out.println(ans);
    }
}
