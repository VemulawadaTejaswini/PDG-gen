import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][2];
        boolean[][] flag = new boolean[h][w];
        for (int i=0; i<m; i++) {
            arr[i][0] = sc.nextInt() - 1;
            arr[i][1] = sc.nextInt() - 1;
            flag[arr[i][0]][arr[i][1]] = true;
        }

        int[] cntH = new int[h];
        int[] cntW = new int[w];

        for (int i=0; i<m; i++) {
            cntH[arr[i][0]]++;
            cntW[arr[i][1]]++;
        }

        int maxH = 0;
        int idxH = 0;
        int maxW = 0;
        int idxW = 0;
        for (int i=0; i<h; i++) {
            if (maxH < cntH[i]) {
                maxH = cntH[i];
                idxH = i;
            }
        }

        int cnt = 0;
        for (int i=0; i<w; i++) {
            if (flag[idxH][i]) {
                cnt = Math.max(cnt, maxH + cntW[i] - 1);
            } else {
                cnt = Math.max(cnt, maxH + cntW[i]);
            }
        }

        System.out.println(cnt);

    }



}

