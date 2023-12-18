import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        String[] s = new String[h];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next();
        }

        int result = 0;
        int c1 = 0;
        int c2 = 0;
        String[] white = new String[h];
        String[] black = new String[h];

        String[][] mat = new String[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                mat[i][j] = s[i].substring(j, j + 1);
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (mat[i][j].equals(".")) {
                    c1 = c1 + 1;
                } else {
                    c2 = c2 + 1;
                }
            }
        }

        if (c1 == 0 || c2 == 0){
            result = 0;
        }



        System.out.println(result);
    }
}









