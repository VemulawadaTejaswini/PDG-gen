import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    boolean union[];
    char[][] str;
    int n;

    void run() {
        for (;;) {
            n = sc.nextInt();
            if (n == 0)
                break;
            int[] in = new int[256];
            int[] out = new int[256];
            str = new char[n][2];
            for (int i = 0; i < n; i++) {
                char[] tmp = sc.next().toCharArray();
                str[i][0] = tmp[0];
                str[i][1] = tmp[tmp.length - 1];
                in[str[i][0]]++;
                out[str[i][1]]++;
            }
            union = new boolean[256];
            dfs(str[0][0]);
            boolean flag = true;
            for (int i = 'a'; i <= 'z'; i++) {
                if (!union[i] && in[i] + out[i] != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                boolean ok = true;
                for (int i = 'a'; i <= 'z'; i++) {
                    if (Math.abs(in[i] - out[i]) != 0) {
                        ok = false;
                        break;
                    }
                }
                System.out.println(ok ? "OK" : "NG");
            } else {
                System.out.println("NG");
            }
        }
    }

    void dfs(char c) {
        for (int i = 0; i < n; i++) {
            if (str[i][0] == c) {
                if (!union[str[i][1]]) {
                    union[str[i][1]] = true;
                    dfs(str[i][1]);
                }
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

}