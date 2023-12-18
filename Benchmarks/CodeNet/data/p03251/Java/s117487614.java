import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};
    static int[] x8 = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] y8 = {0, -1, -1, -1, 0, 1, 1, 1};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        int[] X = new int[n+1];
        for(int i = 0; i < n; i++) {
            X[i] = in.nextInt();
        }
        X[n] = x;
        int[] Y = new int[m+1];
        for(int i = 0; i < m; i++) {
            Y[i] = in.nextInt();
        }
        Y[m] = y;

        Arrays.sort(X);
        Arrays.sort(Y);

        int a = X[n];
        int b = Y[0];

        if(a >= b) {
            System.out.println("War");
        }else{
            System.out.println("No War");
        }
    }

    static public void printArray2D(char[][] map) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.format("%c\t", map[i][j]);
            }
            System.out.print("\n");
        }
    }

    static public void printArray2D(int[][] map) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.format("%d\t", map[i][j]);
            }
            System.out.print("\n");
        }
    }
}
