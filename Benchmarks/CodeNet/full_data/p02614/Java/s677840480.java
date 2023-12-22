import java.math.*;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();
    char[][] arr = new char[h][w];
    int[][] flag = new int[h][w];
    long cnt = 0;


    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        for (int i=0; i<h; i++) arr[i] = sc.next().toCharArray();

        dfs1("");

        System.out.print(cnt);

    }

    void dfs1(String s) {
        if (s.length() == h) {
//            System.out.println(s);
            dfs2("", s);
        } else {
            for (int i=0; i<2; i++) {
                dfs1(s + i);
            }
        }
    }

    void dfs2(String s, String def) {
        if (s.length() == w) {
//            System.out.println(def);
//            System.out.println(s);

            flag = new int[h][w];

            for (int i=0; i<h; i++) {
                char c = def.charAt(i);
                if (c == '1') {
                    for (int j=0; j<w; j++) {
                        flag[i][j] = 1;
                    }
                }
            }
            for (int i=0; i<w; i++) {
                char c = s.charAt(i);
                if (c == '1') {
                    for (int j=0; j<h; j++) {
                        flag[j][i] = 1;
                    }
                }
            }

            int black = 0;
            for (int i=0; i<h; i++) {
                for (int j=0; j<w; j++) {
                    if (arr[i][j] == '#' && flag[i][j] == 0) {
                        black++;
                    }
                }
            }
            if (black == k) cnt++;

        } else {
            for (int i=0; i<2; i++) {
                dfs2(s + i, def);
            }
        }
    }


}

