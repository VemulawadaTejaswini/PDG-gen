
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MAX_LEN = 30;
    int[][] as;
    int tmp;
    int n;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            as = new int[n][];
            for (int j = 0; j < n; j++) {
                String[] es = br.readLine().split(" ");
                as[j] = new int[MAX_LEN];
                for (int i = 0; i < MAX_LEN; i++) {
                    as[j][i] = Integer.parseInt(es[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void solve() {
        for (n = 0; n < as.length; n++) {
            int ans = dfs(0);
            System.out.println(ans);
        }
    }

    private int dfs(int depth) {
        if (check())
            return depth;
        if (depth == 8)
            return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE, tmp;
        for (int i = 0; i < 4; i++) {
            operation(i);
            tmp = dfs(depth+1);
            min = Math.min(min, tmp);
            operation(i);
        }
        return min;
    }

    private void operation(int op) {
        switch (op) {
            case 0:
                for (int i = 0; i < 3; i++) {
                    swap(i, 27+i);
                }
                swap(14, 15);
                swap(18, 20);
                break;
            case 1:
                for (int i = 0; i < 3; i++) {
                    swap(6+i, 21+i);
                }
                swap(12, 17);
                swap(9, 11);
                break;
            case 2:
                for (int i = 0; i < 3; i++) {
                    swap(i*3, 23+3*i);
                }
                swap(15, 17);
                swap(9, 20);
                break;
            case 3:
                for (int i = 0; i < 3; i++) {
                    swap(2+3*i, 21+3*i);
                }
                swap(11, 18);
                swap(12, 14);
                break;
            default:
                break;
        }

    }

    private void swap(int i, int j) {
        tmp = as[n][i];
        as[n][i] = as[n][j];
        as[n][j] = tmp;
    }

    private boolean check() {
        boolean flg = true;
        for (int i = 0; i < 9; i++) {
            flg &= as[n][0] == as[n][i];
        }
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                flg &= as[n][i*3] == as[n][i*3+j];
            }
        }
        for (int i = 23; i < MAX_LEN; i++) {
            flg &= as[n][23] == as[n][i];
        }
        return flg;
    }
}