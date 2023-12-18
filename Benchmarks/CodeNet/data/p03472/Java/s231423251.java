import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};

    static int n, h;
    static int[] a, b;

    public static void main(String[] args) {
        input();
        solve();
    }

    static void solve() {
        int cnt = 0;
        int maxA = Arrays.stream(a).max().getAsInt();
        Arrays.sort(b);

        for(int i = n-1; i >= 0; i--) {
            if(h <= 0) break;
            
            if(maxA >= b[i]) {
                cnt += (int)(Math.ceil((double)h / (double)maxA));
                break;
            }else{
                h -= b[i];
                cnt++;
            }
        }

        print(cnt);
    }

    static void input() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        h = in.nextInt();
        a = new int[n];
        b = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
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