import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};

    static char[] s;
    static int w;

    public static void main(String[] args) {
        input();
        solve();
    }

    static void solve() {
        int n = s.length;
        int i = 1;
        int cnt = 1;

        System.out.print(s[0]);
        while(true) {
            cnt = i*w;
            i++;
            if(cnt >= n) break;
            System.out.print(s[cnt]);
        }

        print("");
    }

    static void input() {
        Scanner in = new Scanner(System.in);
        s = in.next().toCharArray();
        w = in.nextInt();
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

class P {
    int x, y;
    P(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class E {
    int from, to;
    long w;
    E(int from, int to, long w) {
        this.from = from;
        this.to = to;
        this.w = w;
    }
}
