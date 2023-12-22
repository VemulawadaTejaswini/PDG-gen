import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            if ((N | M) == 0)
                break;
            int r = sc.nextInt();
            int tt[][] = new int[M + 1][1261];
            @SuppressWarnings("unchecked")
            Stack<Integer>[] ss = new Stack[N + 1];
            for (int i = 0; i <= N; i++) {
                ss[i] = new Stack<Integer>();
            }
            for (int i = 0; i < r; i++) {
                int t = sc.nextInt();
                int n = sc.nextInt();
                int m = sc.nextInt();
                int s = sc.nextInt();
                if (s == 1) {
                    ss[n].add(t);
                } else {

                    for (int j = ss[n].pop() + 1; j <= t; j++) {
                        tt[m][j] = tt[m][j - 1] + 1;
                    }
                    for (int j = t + 1; j <= 1260; j++) {
                        tt[m][j] = tt[m][t];
                    }
//                    System.out.println(m + ":");
//                    System.out.println(Arrays.toString(tt[m]));
                }
            }

            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                int ts = sc.nextInt();
                int te = sc.nextInt();
                int m = sc.nextInt();
                System.out.println(tt[m][te] - tt[m][ts]);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}