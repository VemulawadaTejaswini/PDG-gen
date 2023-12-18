//package solution;

import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;

public final class Main {
    BufferedReader br;
    StringTokenizer stk;

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
    
    {
        stk = null;
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    void run() throws Exception {
        String s = " " + nt(), t = " " + nt();
        List<Character>[][] dp = new ArrayList[s.length()][t.length()];
        for(int i=0; i<dp.length; i++) dp[i][0] = new ArrayList<>();
        for(int i=0; i<dp[0].length; i++) dp[0][i] = new ArrayList<>();
        for(int i=1; i<dp.length; i++) {
            for(int j=1; j<dp[0].length; j++) {
                if(s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = new ArrayList<>(dp[i-1][j-1]);
                    dp[i][j].add(s.charAt(i));
                } else {
                    if(dp[i-1][j].size() > dp[i][j-1].size()) {
                        dp[i][j] = new ArrayList<>(dp[i-1][j]);
                    } else {
                        dp[i][j] = new ArrayList<>(dp[i][j-1]);
                    }
                }
            }
        }
        
        List<Character> list = dp[dp.length-1][dp[0].length-1];
        if(list.isEmpty()) {
            pl("");
        } else {
            StringBuilder res = new StringBuilder("");
            for(int i=0; i<list.size(); i++) res.append(list.get(i));
            pl(res);
        }
    }
    
    //Reader & Writer
    String nextToken() throws Exception {
        if (stk == null || !stk.hasMoreTokens()) {
            stk = new StringTokenizer(br.readLine(), " ");
        }
        return stk.nextToken();
    }

    String nt() throws Exception {
        return nextToken();
    }

    String ns() throws Exception {
        return br.readLine();
    }

    int ni() throws Exception {
        return Integer.parseInt(nextToken());
    }

    long nl() throws Exception {
        return Long.parseLong(nextToken());
    }

    double nd() throws Exception {
        return Double.parseDouble(nextToken());
    }

    void p(Object o) {
        System.out.print(o);
    }

    void pl(Object o) {
        System.out.println(o);
    }
    
    void selector() {
        Random rd = new Random();
        String[] s = new String[] {"Strings", "Sorting", "Search"
                , "Graph theory", "Greedy", "Dynamic programming"
                , "Constructive algos", "Bit manipulation", "Recursion"};
        pl(s[rd.nextInt(s.length)] + " " + (rd.nextInt(5)+1));
    }
}