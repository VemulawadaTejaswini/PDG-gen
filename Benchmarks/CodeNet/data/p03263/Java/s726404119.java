import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int[][] arr = new int[H][W];
        for (int i=0;i<H;i++) {
            for (int j=0;j<W;j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        Task tsk = new Task();
        List<int[]> moves = tsk.solve(arr);
        System.out.println(moves.size());
        for (int[] line: moves) System.out.println(++line[0] + " " + ++line[1] + " " + ++line[2] + " " + ++line[3]);
    }

    static class Task{
        public List<int[]> solve(int[][] arr) {
            int m = arr.length, n = arr[0].length;
            List<int[]> res = new ArrayList<>();
            int[] pair = null;
            for (int i=0;i<m;i++) {
                for (int j=0;j<n;j++){
                    if (arr[i][j] % 2 == 1) {
                        if (pair == null) pair = new int[]{i, j};
                        else {
                            if (pair[1] > j) for (int y = pair[1]; y > j; y--) res.add(new int[]{pair[0], y, pair[0], y - 1});
                            else for (int y = pair[1]; y<j; y++) res.add(new int[]{pair[0], y, pair[0], y + 1});
                            for (int x = pair[0]; x < i; x++) res.add(new int[]{x, j, x+1, j});
                            pair = null;
                        }
                    }
                }
            }
            return res;
        }
    }
}
