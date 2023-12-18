
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
    static int[] dp;
    static int[] a;
    static int k;

    public static int re(int i) {
        //System.out.println(i);
        if (i > 0) {
            if (i - k <= 0) {
                return dp[i] = Math.abs(a[i] - a[0]);
            }
            if (dp[i] != -1) {
                return dp[i];
            } else {
                if (dp[i] == -1) {
                    dp[i] = Integer.MAX_VALUE;
                }
                for (int j = 1; j <= k; j++) {
                    if (i - j >= 0) {
                        //System.out.println(i + " send " + (i - j));
                        //if(i==6 ||i-j ==6){
                        //}
// <editor-fold defaultstate="collapsed" desc=" less calls ">
                        if (dp[i - j] != -1) {
                            dp[i] = Math.min(Math.abs(dp[i - j] + Math.abs(a[i - j] - a[i])), dp[i]);
                        }
// </editor-fold>
                        dp[i] = Math.min(Math.abs(re(i - j) + Math.abs(a[i - j] - a[i])), dp[i]);
                    }
                }
                return dp[i];
            }
        }
        return dp[0] = Integer.MAX_VALUE;//bad path
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        t = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        a = new int[t];
        dp = new int[t];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            dp[i] = -1;
        }
        re(t - 1);
        //out.println(Arrays.toString(a));
        //out.println(Arrays.toString(dp));
        out.println(dp[t - 1]);
        out.flush();
    }
}
/*
10
0 0 0 0 0 0 0 0 123 23
 */
