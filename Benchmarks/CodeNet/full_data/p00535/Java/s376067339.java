import java.util.*;

public class Main {
    private static final int[] DIR = {-1, -1, 1, 1, -1, 0, 1, 0, -1};

    public static void main(String[] args) {
        int[][] fld;
        int h, w;
        try(Scanner scn = new Scanner(System.in)) {
            h = scn.nextInt();
            w = scn.nextInt();
            fld = new int[h][w];
            for(int i = 0; i < h; i++) {
                char[] ary = scn.next().toCharArray();
                for(int j = 0; j < w; j++) {
                    try {
                        fld[i][j] = Integer.parseInt(String.valueOf(ary[j]));
                    } catch(NumberFormatException e) {
                        fld[i][j] = 0;
                    }
                }
            }
        }

        int ans = -1;
        ArrayList<int[]> list = null;
        while(list == null || list.size() > 0) {
            list = new ArrayList<>();
            for(int i = 1; i < ~-h; i++) {
                for(int j = 1; j < ~-w; j++) {
                    if(fld[i][j] > 0) {
                        int cnt = 0;
                        for(int d = 0; d < 8; d++) {
                            if(fld[i + DIR[d]][j + DIR[-~d]] == 0) {
                                cnt++;
                            }
                        }
                        if(fld[i][j] <= cnt) {
                            list.add(new int[] {i, j});
                        }
                    }
                }
            }
            for(int[] coord : list) {
                fld[coord[0]][coord[1]] = 0;
            }
            ans++;
        }
        System.out.println(ans);
    }
}