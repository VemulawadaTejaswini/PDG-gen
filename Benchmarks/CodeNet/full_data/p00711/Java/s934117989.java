import java.util.Scanner;

public class Main {
    static Scanner sc;

    static int n,m;
    static boolean[][] ss;
    static int cnt;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        // ?????????????§???????
        String[] a;
        while(true) {
            a = GetSubStringLine();
            m = Integer.parseInt(a[0]);
            n = Integer.parseInt(a[1]);
            if (m == 0 && n == 0) {
                break;
            }
            ss = new boolean[n][m];
            int x = 0,y = 0;
            cnt = 0;
            for (int i=0;i<n;i++) {
                String sss = sc.nextLine();
                for (int j=0;j<sss.length();j++) {
                    switch (sss.charAt(j)) {
                        case '.':
                            ss[i][j] = true;
                            break;
                        case '#':
                            ss[i][j] = false;
                            break;
                        case '@':
                            ss[i][j] = true;
                            x = j;
                            y = i;
                            break;
                    }
                }
            }
            dfs(y,x);
            System.out.println(cnt);
        }
    }

    static void dfs(int y, int x) {
        if (y < 0 || y >= n || x < 0 || x>= m) {
            return;
        }
        if (!ss[y][x]) {
            return;
        }
        ss[y][x] = false;
        cnt++;
        dfs(y-1,x);
        dfs(y,x-1);
        dfs(y+1,x);
        dfs(y,x+1);
    }

    public static String[] GetSubStringLine() {
        String s = sc.nextLine();
        return s.split(" ");
    }
}