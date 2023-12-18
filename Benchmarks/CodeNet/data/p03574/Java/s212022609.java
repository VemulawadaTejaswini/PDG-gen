import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][] cs = new int[h + 2][w + 2];
        for (int i = 0; i < h; i++) {
            Arrays.fill(cs[i + 1], 0);
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                if (s.charAt(j) == '#') {
                    cs[i + 1][j + 1] = 1;
                } else {
                    cs[i + 1][j + 1] = 0;
                }
            }
        }

        for (int i = 1; i < h + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (cs[i][j] == 1) {
                    System.out.print('#');
                } else {
                    int total = cs[i - 1][j - 1] + cs[i - 1][j] + cs[i - 1][j + 1] + cs[i][j - 1] + 
                    cs[i][j + 1] + cs[i + 1][j - 1] + cs[i + 1][j] + cs[i + 1][j + 1];
                    System.out.print(total);
                }
            }
            System.out.println();
        }
    }
}
