import java.io.*;
import java.util.*;

public class Main {
    Scanner sc;
    int H, W;
    char[][] rect;
    int[][] xmax;

    Main() {
        sc = new Scanner(System.in);
    }

    boolean init() {
        H = sc.nextInt();
        W = sc.nextInt();
        if (H == 0 && W == 0) return false;
        rect = new char[H][W];
        for (int i = 0; i < H; i++) 
            rect[i] = sc.next().toCharArray();
        return true;
    }

    void run() {
        while (init()) {
            xmax = new int[H][W];
            for (int i = 0; i < H; i++) {
                if (rect[i][0] == '.') xmax[i][0] = 1;
                else xmax[i][0] = 0;
                for (int j = 1; j < W; j++) {
                    if (rect[i][j] == '.') {
                        xmax[i][j] = xmax[i][j-1]+1;
                    } else {
                        xmax[i][j] = 0;
                    }
                }
            }

            int max_area = 0;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    int min_xmax = xmax[i][j];
                    for (int y = i; y >= 0; y--) {
                        min_xmax = Math.min(min_xmax, xmax[y][j]);
                        max_area = Math.max(max_area, min_xmax * (i-y+1));
                    }
                }
            }

            System.out.println(max_area);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}