import java.util.Deque;
import java.util.ArrayDeque;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] xyhs = new int[n][3];
        
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            xyhs[i][0] = Integer.parseInt(line[0]);
            xyhs[i][1] = Integer.parseInt(line[1]);
            xyhs[i][2] = Integer.parseInt(line[2]);
        }
        
        int a = 0;
        int b = 1;
        outer: for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (xyhs[i][0] != xyhs[j][0] && xyhs[i][1] != xyhs[j][1]) {
                    a = i;
                    b = j;
                    break outer;
                }
            }
        }
        
        int cx = 0;
        int cy = 0;
        int h = 0;
        if (n == 1) {
            cx = xyhs[0][0];
            cy = xyhs[0][1];
            h = xyhs[0][2];
        }
        else {
            outer: for (int i = 0; i <= 100; i++) {
                for (int j = 0; j <= 100; j++) {
                    
                    if (Math.abs(xyhs[a][0]-i) + Math.abs(xyhs[a][1]-j) + xyhs[a][2] == Math.abs(xyhs[b][0]-i) + Math.abs(xyhs[b][1]-j) + xyhs[b][2]) {
                        cx = i;
                        cy = j;
                        h = xyhs[a][2] + Math.abs(xyhs[a][0]-i) + Math.abs(xyhs[a][1]-j);
                        if (n > 1) {
                            for (int k = 0; k <= n-1; k++) {
                                if (h - Math.abs(xyhs[k][0]-cx) - Math.abs(xyhs[k][1]-cy) == xyhs[k][2]) {
                                    if (k == n-1) break outer;
                                }
                                else {
                                    break;
                                }
                            }
                        }//System.out.println(cx + " " + cy + " " + h);
                    }
                }
            }
        }
        //System.out.println(xyhs[0][2]);
        System.out.println(cx + " " + cy + " " + h);
    }
}
