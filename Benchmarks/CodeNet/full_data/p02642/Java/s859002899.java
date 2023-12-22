import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int ans = 0;

        L: for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j && a[i] % a[j] == 0) {
                    continue L;
                }
                if (a[j] % a[i] == 0) {
                    
                }
            }
            ans++;
        }

        System.out.println(ans);
    }

}
