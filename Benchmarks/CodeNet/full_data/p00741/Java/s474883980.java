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
                a = GetSubStringLine();
                for (int j=0;j<m;j++) {
                    switch (a[j].charAt(0)) {
                        case '1':
                            ss[i][j] = true;
                            break;
                        case '0':
                            ss[i][j] = false;
                            break;
                    }
                }
            }
            for (int i=0;i<n;i++) {
                for (int j=0;j<m;j++) {
                    if (ss[i][j]) {
                        cnt++;
                        dfs(i, j);
                    }
                }
            }
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
        for (int i=-1;i<2;i++) {
            for (int j=-1;j<2;j++) {
                if (i!=0||j!=0) {
                    dfs(y+i,x+j);
                }
            }
        }
    }

    public static String[] GetSubStringLine() {
        String s = sc.nextLine();
        return s.split(" ");
    }
}