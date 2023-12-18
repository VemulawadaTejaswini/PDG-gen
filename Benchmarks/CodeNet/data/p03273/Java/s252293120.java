import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();scan.nextLine();
        char[][] c = new char[h][w];
        for (int i = 0; i < h; i++) {
            String s = scan.nextLine();
            for(int j = 0; j < w; j++) {
                c[i][j] = s.charAt(j);
            }
        }
        boolean[] tate = new boolean[h];
        boolean[] yoko = new boolean[w];
        Arrays.fill(tate, true);
        Arrays.fill(yoko, true);
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if (c[i][j] != '.') {
                    tate[i] = false;
                }
            }
        }
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (c[j][i] != '.') {
                    yoko[i] = false;
                }
            }
        }
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if (tate[i]) continue;
                if (yoko[j]) continue;
                System.out.print(c[i][j]);
                if (j == w-1) System.out.println();
            }
        }
    }
}