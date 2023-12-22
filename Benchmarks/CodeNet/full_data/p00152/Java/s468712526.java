import java.util.Scanner;

//0152
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = Integer.parseInt(sc.nextLine());
            if (n == 0)
                break;
            int[][] sl = new int[n][2];
            for (int i = 0; i < n; i++) {
                String[] l = sc.nextLine().split(" ");
                int[] s = new int[l.length];
                for (int j = 0; j < l.length; j++) {
                    s[j] = Integer.parseInt(l[j]);
                }
                int t = 0;
                for (int j = 0, p = 1; j < 10; j++) {
                    if (s[p] == 10) {
                        t += 10 + s[p + 1] + s[p + 2];
                        p++;
                    } else if (s[p] + s[p + 1] == 10) {
                        t += 10 + s[p + 2];
                        p += 2;
                    } else {
                        t += s[p] + s[p + 1];
                        p += 2;
                    }
                }
                sl[i][0] = s[0];
                sl[i][1] = t;
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (sl[i][1] < sl[j][1]) {
                        int t = sl[i][0];
                        sl[i][0] = sl[j][0];
                        sl[j][0] = t;
                        t = sl[i][1];
                        sl[i][1] = sl[j][1];
                        sl[j][1] = t;
                    } else if (sl[i][0] > sl[j][0] && sl[i][1] == sl[j][1]) {
                        int t = sl[i][0];
                        sl[i][0] = sl[j][0];
                        sl[j][0] = t;
                    }
                }
            }
            for (int[] i : sl) {
                System.out.println(i[0] + " " + i[1]);
            }
        }
    }
}
