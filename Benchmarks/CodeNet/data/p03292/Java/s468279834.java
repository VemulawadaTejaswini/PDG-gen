import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};

    static int[] a;

    public static void main(String[] args) {
        input();
        solve();
    }

    static void solve() {
       Arrays.sort(a);
       int ans = 0;
       for(int i = 2; i >= 1; i--) {
           ans += a[i-1] - a[i];
       }
       print(Math.abs(ans));
    }

    static void input() {
        Scanner in = new Scanner(System.in);
        a = new int[3];
        a[0] = in.nextInt();
        a[1] = in.nextInt();
        a[2] = in.nextInt();
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