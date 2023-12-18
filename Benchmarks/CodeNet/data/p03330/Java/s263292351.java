import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scan.nextInt();
        int c = scan.nextInt();
        int[][] d = new int[c][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                d[i][j] = scan.nextInt();
            }
        }
        int[][] g = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                g[i][j] = scan.nextInt() - 1;
            }
        }
        Main main = new Main();
        System.out.println(main.solve(n, c, d, g));
    }

    public int solve(int n, int c, int[][] d, int[][] g) {
        int[][] count_of_colors = new int[3][30];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                count_of_colors[(i+j)%3][g[i][j]] += 1;
            }
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < c; i++) {
            int first_group_difference = difference(d, c, count_of_colors[0], i);
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    continue;
                }
                int second_group_difference = difference(d, c, count_of_colors[1], j);
                for (int k = 0; k < c; k++) {
                    if (i == k || j == k) {
                        continue;
                    }
                    int third_group_difference = difference(d, c, count_of_colors[2], k);
                    answer = Math.min(answer, first_group_difference + second_group_difference + third_group_difference);
                }
            }
        }
        return answer;
    }

    public int difference(int[][] d, int c, int[] count, int color) {
        int diff = 0;
        for(int i = 0; i < c; i++) {
            diff += count[i] * d[i][color];
        }
        return diff;
    }
 
}