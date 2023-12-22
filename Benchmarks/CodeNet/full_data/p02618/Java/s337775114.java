import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = Integer.parseInt(sc.next());
        int[] c = new int[26];
        int[] cd = new int[26];
        for (int i = 0; i < 26; i++) {
            c[i] = Integer.parseInt(sc.next());
        }
        int[][] s = new int[D][26];
        for (int i = 0; i < D; i++) {
            for (int j = 0; j < 26; j++) {
                int temp = Integer.parseInt(sc.next());
                s[i][j] = temp;
            }
        }
        int[] t = new int[D];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < D; i++) {
            int con = best(c, cd, s, i + 1);
            cd[con] = i + 1;
            t[i] = con + 1;
//            int temp = Integer.parseInt(sc.next());
//            t[i] = temp;
//            int temp = max[i];
//            cd[temp - 1] = i + 1;
//            ans += s[i][temp - 1] - totalSubC(c, cd, i + 1);
//            sb.append(ans);
//            sb.append(max[i]);
//            sb.append(con + 1);
//            sb.append("\n");
        }
//        int m = Integer.parseInt(sc.next());
        Arrays.fill(cd, 0);
        int ans = total(c, cd, s, t, D);
        for (int i = 0; i < 200000; i++) {
            Arrays.fill(cd, 0);
            Random r = new Random();
            int d = r.ints(0, D).findFirst().getAsInt();
            int q = r.ints(1, 27).findFirst().getAsInt();
            int old = t[d];
            t[d] = q;
            int temp = total(c, cd, s, t, D);
            if (ans > temp) {
                t[d] = old;
            } else {
                ans = temp;
            }
        }
        for (int i = 0; i < D; i++) {
//            int temp = t[i];
//            cd[temp - 1] = i + 1;
//            ans += s[i][temp - 1] - totalSubC(c, cd, i + 1);
//            sb.append(ans);
//            sb.append(max[i]);
//            sb.append(con + 1);
//            sb.append("\n");
            sb.append(t[i]);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    private static int totalSubC(int[] c, int[] cd, int d) {
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += c[i] * (Math.max(0, d - cd[i]));
        }
        return ans;
    }

    private static int total(int[] c, int[] cd, int[][] s, int[] t, int D) {
        int ans = 0;
        for (int i = 0; i < D; i++) {
            cd[t[i] - 1] = i + 1;
            ans += s[i][t[i] - 1] - totalSubC(c, cd, i + 1);
        }
        return ans;
    }

    private static int best(int[] c, int[] cd, int[][] s, int d) {
        int ans = 0;
        int max = -1000000;
        for (int i = 0; i < 26; i++) {
            int old = cd[i];
            cd[i] = d;
            for (int j = 0; j < 26; j++) {
                int temp = s[d - 1][j] - totalSubC(c, cd, d);
                if (max < temp) {
                    ans = j;
                    max = temp;
                }
            }
            cd[i] = old;
        }
        return ans;
    }
}