import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int cx;
    public static int cy;
    public static int[][] ary;
    public static int count;
    public static void main(String[] args) throws Exception {
        while (sc.hasNext()){
            ary = new int[21][21];
            cx = 10;
            cy = 10;
            count = 0;
            int n = sc.nextInt();
            if (n == 0) break;
            for (int i = 0; i < n; i++) {
                ary[sc.nextInt()][sc.nextInt()] = 1;
            }
            
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                String s = sc.next();
                int dis = sc.nextInt();

                int x = 0;
                int y = 0;
                if (s.equals("N")) {
                    y = 1;
                } else if (s.equals("S")) {
                    y = -1;
                } else if (s.equals("E")) {
                    x = 1;
                } else if (s.equals("W")) {
                    x = -1;
                }
                
                for (int j = 0; j < dis; j++) {
                    move(x, y);
                }
            }
            
            if (count == n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    
    public static void move(int x, int y) {
        cx += x;
        cy += y;
        if (ary[cx][cy] == 1) {
            ary[cx][cy] = 0;
            count++;
        }
    }
}