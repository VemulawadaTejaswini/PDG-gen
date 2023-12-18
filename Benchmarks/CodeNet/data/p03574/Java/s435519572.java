import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][] a = new int[h+2][w+2];
        int[][] rA = new int[][]{
                {-1, 0}, {-1, 1}, {-1, -1}, {0, 1},
                {0, -1}, {1, 0}, {1, 1}, {1, -1}
        };

        for (int i = 1; i < h+1; i++) {
            String s = sc.next();
            for (int j = 1; j < w+1; j++) {
                char c = s.charAt(j-1);
                if (c == '#') {
                    a[i][j] = -100;
                    for (int[] r : rA)
                        a[i+r[0]][j+r[1]]++;
                }
            }
        }

        for (int i = 1; i < h+1; i++) {
            for (int j = 1; j < w+1; j++) {
                if (a[i][j] < 0)
                    sb.append('#');
                else
                    sb.append(a[i][j]);
            }
            sb.append(System.getProperty("line.separator"));
        }
        System.out.print(sb.toString());
    }
}