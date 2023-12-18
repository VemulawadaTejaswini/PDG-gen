import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};

    static int n, m;
    static P[] conditions;

    public static void main(String[] args) {
        input();
        solve();
    }

    static void solve() {
        Arrays.sort(conditions, (P a, P b) -> a.y - b.y);
        int cleared = 0;
        int ans = 1;
        int cut = conditions[cleared].y-1;
        while(cleared < m-1) {
            if(cut >= conditions[cleared+1].x) {
                cleared++;
                continue;
            }else{
                cleared++;
                cut = conditions[cleared].y-1;
                ans++;
            }
        }

        print(ans);
    }

    static void input() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        conditions = new P[m];
        for(int i = 0; i < m; i++) {
            conditions[i] = new P(in.nextInt(), in.nextInt());
        }
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(char c) {
        System.out.println(c);
    }

    static void print(int i) {
        System.out.println(i);
    }

    static void print(long i) {
        System.out.println(i);
    }

    static void print(float i) {
        System.out.println(i);
    }

    static void printArray2D(int[][] array, char del) {
        int r = array.length;
        int c = array[0].length;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.format("%3d", array[i][j]);
                if(j != c-1) System.out.print(del);
                else System.out.print('\n');
            }
        }
    }
}