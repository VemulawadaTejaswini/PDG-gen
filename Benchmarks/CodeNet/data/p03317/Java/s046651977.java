
import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = sc.nextInt();

        // 配列の順番は関係ない。左からKづつ操作していけばいい
        out.println(N/K + N%K);
    }
}
