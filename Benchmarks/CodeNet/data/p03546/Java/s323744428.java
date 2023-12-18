import java.util.*;


public class Main {
    private static int[][] c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        c = new int[10][10];
        int[][] a = new int[h][w];
        for (int i = 0 ; i < 10 ; i++) {
            for (int j = 0 ; j < 10 ; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        for (int i = 0 ; i < h ; i++) {
            for (int j = 0 ; j < w ; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0 ; i < 10 ; i++) {
            for (int j = 0 ; j < 10 ; j++) {
                for (int k = 0 ; k < 10 ; k++) {
                    c[j][k] = Math.min(c[j][k],c[j][i]+c[i][k]);
                }
            }
        }

        int cnt = 0;
        for (int i = 0 ; i < h ; i++) {
            for (int j = 0 ; j < w ; j++) {
                if (a[i][j] >= 0) cnt += c[a[i][j]][1];
            }
        }
        System.out.println(cnt);
    }
}