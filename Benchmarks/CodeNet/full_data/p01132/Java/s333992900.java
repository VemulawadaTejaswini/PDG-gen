import java.util.Scanner;

public class Main {
    static int[] ps = { 10, 50, 100, 500 };

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean init = true;
        while (true) {
            int m = sc.nextInt();
            if (m == 0)
                break;
            if(init )init = false;
            else System.out.println();
            int ns[] = new int[4];
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                ns[i] = sc.nextInt();
                sum += ns[i];
            }
            int[] ans = new int[4];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i <= ns[0]; i++) {
                for (int j = 0; j <= ns[1]; j++) {
                    for (int k = 0; k <= ns[2]; k++) {
                        for (int l = 0; l <= ns[3]; l++) {
                            if (i * ps[0] + j * ps[1] + k * ps[2] + l * ps[3] < m)
                                continue;
                            int[] cs = { i, j, k, l };
                            int[] turi = change(i * ps[0] + j * ps[1] + k
                                    * ps[2] + l * ps[3] - m);
                            boolean bad = check(cs, turi);
                            if (bad)
                                continue;
                            int res = 0;
                            for (int p = 0; p < 4; p++) {
                                res += turi[p];
                            }
                            if (min > sum - (i + j + k + l) + res) {
                                min = sum - (i + j + k + l) + res;
                                ans = cs;
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < 4; i++) {
                if (ans[i] == 0)
                    continue;
                System.out.println(ps[i] + " " + ans[i]);
            }
        }
    }

    static boolean check(int a[], int b[]) {
        boolean res = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && b[i] > 0)
                res = true;
        }
        return res;
    }

    static int[] change(int n) {
        int cs[] = new int[4];
        for (int i = 3; i >= 0; i--) {
            cs[i] = n / ps[i];
            n %= ps[i];
        }
        return cs;
    }
}