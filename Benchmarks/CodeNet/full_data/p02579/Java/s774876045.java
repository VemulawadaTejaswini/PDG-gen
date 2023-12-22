import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static boolean isReached;
    static int countOfWarp;
    static int ans;
    static int H;
    static int W;
    static int DH;
    static int DW;
    static boolean S[][];
    static boolean visited[][];

    static int d[][] = {{1,0}, {0,-1}, {-1,0}, {0,1}};

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner sc = new Scanner(is);

        isReached = false;
        countOfWarp = 0;
        ans = 0;

        H = sc.nextInt();
        W = sc.nextInt();
        int CH = sc.nextInt()-1;
        int CW = sc.nextInt()-1;
        DH = sc.nextInt()-1;
        DW = sc.nextInt()-1;
        S = new boolean[H][W];
        visited = new boolean[H][W];

        for (int i = 0; i < H; i++) {
            String line = sc.next();
            for (int j = 0; j < W; j++){
                if(line.charAt(j) == '.')
                    S[i][j] = true;
                else
                    S[i][j] = false;
            }
        }

        search(CH, CW, 0, false);
        if(!isReached)
            search(CH, CW, 0, true);

        if(!isReached)
            os.println("-1");
        else
            os.println(ans);
    }


    static void search(int startH, int startW, int dn, boolean isWarpable) {
        visited[startH][startW] = true;
        if(startH == DH && startW == DW){
            ans = countOfWarp;
            isReached = true;
            return;
        }
        for(int i = 0; i < 3; i++) {
            int nextD = dn;
            if(i == 0)
                nextD = dn;
            else if(i == 1)
                nextD = (dn+1)%4;
            else if(i == 2)
                nextD = (dn+3)%4;

            int nextH = startH + d[nextD][0];
            int nextW = startW + d[nextD][1];
            if(0 <= nextH && nextH < H && 0 <= nextW && nextW <W) {
                if(S[nextH][nextW] && (isWarpable || !visited[nextH][nextW])){
                    search(nextH, nextW, nextD, isWarpable);
                } else if(isWarpable){
                    for(int k = 0; k < 2; k++) {
                        if(d[nextD][0] == 0) {
                            int nnW = nextW + k;
                            for (int j = -2; j < 3; j++) {
                                int nnH = j;
                                if(0 <= nnH && nnH < H && 0 <= nnW && nnW < W && S[nnH][nnW] && !visited[nnH][nnW]){
                                    warp(nnH, nnW);
                                }
                            }
                        } else {
                            int nnH = nextH + k;
                            for (int j = -2; j < 3; j++) {
                                int nnW = j;
                                if(0 <= nnH && nnH < H && 0 <= nnW && nnW < W && S[nnH][nnW] && !visited[nnH][nnW]){
                                    warp(nnH, nnW);
                                }
                            }
                        }
                    }
                }
            }
            if(isReached)
                return;
        }
    }

    static void warp(int startH, int startW) {
        countOfWarp++;
        search(startH, startW, 0, false);
        if(!isReached) {
            search(startH, startW, 0, true);
        }

        countOfWarp--;
    }

}