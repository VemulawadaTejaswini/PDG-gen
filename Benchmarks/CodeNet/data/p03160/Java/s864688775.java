
import java.util.Arrays;
import java.util.Scanner;

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
        //System.out.println(i);
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        a = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = in.nextInt();
        }
        dp = new int[t];
        System.out.println(re(t - 1));
       // System.out.println(Arrays.toString(dp));
    }
}
