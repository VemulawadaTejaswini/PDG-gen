
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Adly
 */
public class Main {

    static int t;
    static int[][] dp;
    static int[][] a;

    public static int re(int d, int i) {
        if (d > 0) {
            if (dp[d][i] != -1) {
                return dp[d][i];
            } else {
                int tmp = 0;
                for (int act = i; act < 3; act++) {
                    //System.out.println(d+"  "+act);
                    switch (act) {
                        case 0: tmp = Math.max(re(d - 1, 1), re(d - 1, 2)) + a[d][act];
                            break;
                        case 1: tmp = Math.max(re(d - 1, 0), re(d - 1, 2)) + a[d][act];
                            break;
                        case 2: tmp = Math.max(re(d - 1, 0), re(d - 1, 1)) + a[d][act];
                            break;
                        default: break;
                    }
                    dp[d][act] = Math.max(dp[d][act], tmp);
                }
                return dp[d][i];
            }
        }
        return a[d][i];//base case
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        t = Integer.parseInt(st.nextToken());
        a = new int[t][3];
        dp = new int[t][3];
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }
        re(t - 1, 0);
        int max = -1;
        for (int i = 0; i < 3; i++) {
            max = Math.max(max, dp[t - 1][i]);
        }
        if (max==-1){
            for (int i = 0; i < 3; i++) {
                max=Math.max(a[t-1][i],max);
            }
        }
        out.println(max);
        //out.println(re(t - 1, 0));
        out.flush();
    }
}
/*
10
0 0 0 0 0 0 0 0 123 23
 */
