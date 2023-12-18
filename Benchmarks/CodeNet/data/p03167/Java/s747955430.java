import java.io.*;
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        String[][] input = new String[h][w];
        for (int i = 0; i < h; i++) {
            String s = scan.next();
            for (int j = 0; j < s.length(); j++) {
                input[i][j] = s.substring(j, j + 1);
            }
        }
        int solve = dp(h, w, input);
        System.out.println(solve);
    }

    public static int dp(int h, int w, String[][] input) {
        int mod = (int)Math.pow(10, 9) +7;
        int[][] arr = new int[h][w];
        arr[0][0] = 1;
        for (int i = 1; i < h; i++) {
            if (!input[i][0].equals("#")) {
                arr[i][0] = arr[i - 1][0]%mod;
            } else {
                arr[i][0] = 0;
            }
        }
        for (int i = 1; i < w; i++) {
            if (!input[0][i].equals("#")) {
                arr[0][i] = arr[0][i - 1]%mod;
            } else {
                arr[0][i] = 0;
            }
        }
        for (int i = 1; i < h; i++) {
            for (int j = 1; j < w; j++) {
                if (!input[i][j].equals("#")) {
                    arr[i][j] = (arr[i - 1][j]%mod + arr[i][j - 1]%mod)%mod;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        return arr[h - 1][w - 1]%mod;
    }

}