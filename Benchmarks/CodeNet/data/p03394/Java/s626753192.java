import java.util.Scanner;

class B {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] ans = new int[N];
        ans[0] = 2;
        ans[1] = 5;
        ans[2] = 63;
        for (int i = 3; i < N; i++)
            ans[i] = 70;
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i > 0)
                sb.append(' ');
            sb.append(ans[i]);
        }
        System.out.println(sb);
    }
}
public class Main {
    public static void main(String...args) {
        B.main();
    }
}