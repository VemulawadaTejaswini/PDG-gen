import java.util.Scanner;

class C {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] a = new int[N];
        for(int i = 0; i < N; i++)
            a[i] = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < N; i++)
            ans += cnt2(a[i]);
        System.out.println(ans);
    }

    static int cnt2(int a) {
        int ret = 0;
        while(a % 2 == 0) {
            ret++;
            a >>= 1;
        }
        return ret;
    }
}
public class Main {
    public static void main(String...args) {
        C.main();
    }
}