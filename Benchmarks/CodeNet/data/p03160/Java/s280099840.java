
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

    public static int re(int i) {
        if (i > 0) {
            if (i == 1 || i == 2) {
                return dp[i] = Math.abs(a[i] - a[0]);
            }
            if (dp[i] != 0) {
                return dp[i];
            } else {
                return dp[i] += Math.min(Math.abs(re(i - 1) + Math.abs(a[i - 1] - a[i])), Math.abs(re(i - 2) + Math.abs(a[i - 2] - a[i])));
            }
        }
        return dp[0] = Integer.MAX_VALUE;//bad path
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        t = Integer.parseInt(st.nextToken());
        a = new int[t];
        dp = new int[t];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        out.println(re(t - 1));out.flush();
    }
}
