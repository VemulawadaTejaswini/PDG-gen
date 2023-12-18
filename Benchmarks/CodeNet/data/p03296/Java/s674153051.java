import java.util.Scanner;

class A {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] a = new int[N];
        for (int i = 0; i < N; i++)
            a[i] = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < N; ) {
            int j = 1;
            while (i + j < N && a[i] == a[i + j])
                j++;
            ans += j / 2;
            i += j;
        }
        System.out.println(ans);
    }
}
public class Main {
    public static void main(String...args) {
        A.main();
    }
}
