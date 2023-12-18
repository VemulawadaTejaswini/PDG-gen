import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println( solve(N, A) );
    }

    private static String solve(int N, int[] A) {
        int[] colors = new int[9];
        int GRAY = 0;
        int TEA = 1;
        int GREEN = 2;
        int MIZU = 3;
        int BLUE = 4;
        int YELLOW = 5;
        int ORANGE = 6;
        int RED = 7;
        int OVER = 8;
        for (int i = 0; i < N; i++) {
            int a = A[i];

            if( a <= 399 ) colors[GRAY]++;
            else if( a <= 799 ) colors[TEA]++;
            else if( a <= 1199 ) colors[GREEN]++;
            else if( a <= 1599 ) colors[MIZU]++;
            else if( a <= 1999 ) colors[BLUE]++;
            else if( a <= 2399 ) colors[YELLOW]++;
            else if( a <= 2799 ) colors[ORANGE]++;
            else if( a <= 3199 ) colors[RED]++;
            else colors[OVER]++;
        }

        int minColor = 0;
        for (int c = GRAY; c <= RED; c++) {
            if( colors[c] != 0 ) {
                minColor ++;
            }
        }

        // OVERが何人いても同じ色を選べばよい
        int min = Math.max(minColor, 1);

        // overの人が全員異なる色を選ぶとよい
        int max = minColor + colors[OVER];

        return min + " " + max;
    }
}
