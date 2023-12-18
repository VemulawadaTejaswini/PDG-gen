import javax.swing.*;
import java.io.*;
import java.sql.Struct;
import java.text.DecimalFormat;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner rd = new Scanner(System.in);
        int n = rd.nextInt();
        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n - 1; i++) {
            int start = rd.nextInt() - 1;
            int end = rd.nextInt() - 1;
            if (graph[start] == null) {
                graph[start] = new ArrayList<Integer>();
            }
            if (graph[end] == null) {
                graph[end] = new ArrayList<Integer>();
            }
            graph[start].add(end);
            graph[end].add(start);
        }
        long[][] dp = new long[n][2];
        for (int i = 0; i < n; i++) {
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        long bValue = recursion(true, -1, graph, 0, dp);
        long wValue = recursion(false, -1, graph, 0, dp);
        System.out.println((bValue + wValue) %1000000007);
    }

    private static long recursion(boolean isBlack, int parent, ArrayList<Integer>[] graph, int pos, long[][] dp) {
        if (dp[pos][isBlack ? 0 : 1] != -1) {
            return dp[pos][isBlack ? 0 : 1];
        }
        long sum = 1;
        if (graph[pos] != null) {
            for (int i = 0; i < graph[pos].size(); i++) {
                int next = graph[pos].get(i);
                if (next != parent) {
                    long curSum = 0;
                    if (!isBlack) {
                        curSum += recursion(true, pos, graph, next, dp);
                    }
                    curSum += recursion(false, pos, graph, next, dp);
                    curSum = curSum % 1000000007;
                    sum = sum * curSum % 1000000007;
                }
            }
        }
        dp[pos][isBlack ? 0 : 1] = sum;
        return sum;
    }
}