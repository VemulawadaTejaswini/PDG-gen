import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] c = new char[H][W];
        ArrayList<int[]> delta = new ArrayList<int[]>();
        int[] arr_1 = {1, 0};int[] arr_2 = {0, 1};int[] arr_3 = {-1, 0};int[] arr_4 = {0, -1};
        delta.add(arr_1);delta.add(arr_2);delta.add(arr_3);delta.add(arr_4);
        for (int i=0;i<H;i++) {
            String S = sc.next();
            for (int j=0;j<W;j++) {
                c[i][j] = S.charAt(j);
            }
        }

        long ans = 0L;
        boolean[][] flag = new boolean[H][W];
        for (int i=0;i<H;i++) {
            for (int j=0;j<W;j++) {
                if (c[i][j]=='.') continue;
                if (flag[i][j]) continue;

                ArrayDeque<int[]> q = new ArrayDeque<int[]>();
                int[] first = {i, j, 0};
                q.add(first);
                int b_cnt = 0;
                int w_cnt = 0;
                while (!q.isEmpty()) {
                    int[] rem = q.poll();
                    if (rem[0]<0 || H<=rem[0] || rem[1]<0 || W<=rem[1]) continue;
                    if (rem[2]%2==0 && c[rem[0]][rem[1]]=='.') continue;
                    if (rem[2]%2==1 && c[rem[0]][rem[1]]=='#') continue;
                    if (flag[rem[0]][rem[1]]) continue;
                    flag[rem[0]][rem[1]] = true;
                    if (rem[2]%2==0) b_cnt++;
                    if (rem[2]%2==1) w_cnt++;
                    for (int[] del : delta) {
                        int[] add = {rem[0]+del[0], rem[1]+del[1], rem[2]+1};
                        q.add(add);
                    }
                }
                // System.out.println("b, w "+b_cnt+" "+w_cnt);

                ans += b_cnt*w_cnt;
            }
        }
        System.out.println(ans);
    }
}