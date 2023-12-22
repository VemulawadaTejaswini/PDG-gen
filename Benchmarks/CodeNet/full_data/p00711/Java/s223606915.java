import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author yousack
 */
public class Main {
    static Scanner in = new Scanner(System.in);
        
    public static void main(String[] args) {
        while (true) {
            int W = in.nextInt();
            int H = in.nextInt();

            if (W == 0 && H == 0) {
                break;
            } else {
                char[][] field = new char[H][W];
                int r = 0, c = 0;

                for (int i = 0; i < H; i++) {
                    field[i] = in.next().toCharArray();
                    for (int j = 0; j < W; j++) {
                        if (field[i][j] == '@') {
                            field[i][j] = '.';
                            r = i;
                            c = j;
                        }
                    }
                }
                
                dfs(field, r, c);
            }
        }
    }
    
    public static void dfs(char[][] f, int r, int c) {
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.add(new int[]{r, c});
        int counter = 0;
        int[][] dirArray = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        
        while (!queue.isEmpty()) {
            int[] curPos = queue.poll();
            int curR = curPos[0], curC = curPos[1];
            if (f[curR][curC] == '.') {
                counter++;
                f[curR][curC] = '@';
                for (int[] next : dirArray) {
                    if (ok(curR + next[0], curC + next[1], f.length, f[0].length)) {
                        queue.add(new int[]{curR + next[0], curC + next[1]});
                    }
                }
            }
        }

        System.out.println(counter);
    }
    
    public static boolean ok(int posR, int posC, int boundR, int boundC) {
        return 0 <= posR && posR < boundR && 0 <= posC && posC < boundC;         
    }
}