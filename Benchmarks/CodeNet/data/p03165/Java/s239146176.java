import java.util.*;
public class Main {
    static int n, m;
    static String s1, s2;
    static int[][] dp;
    static indicies[][] buildback;
    static String ans;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        s1 = kb.next();
        s2 = kb.next();
        n = s1.length();
        m = s2.length();
        dp = new int[n][m];
        buildback = new indicies[n][m];
        for(int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        int len = lcs(0, 0);
        // for(int i = 0; i < buildback.length; i++) {
        //     System.out.println(Arrays.toString(buildback[i]));
        // }
        if(len == 0){
            System.out.println("");
            return;
        }
        int i = 0, j = 0;
        String res = "";
        while(i < n && j < m) {
            indicies cur = buildback[i][j];
            if(i < cur.i && j < cur.j) {
                System.out.print(s1.charAt(i));
            }
            i = cur.i;
            j = cur.j;
        }
       // System.out.println(res);
       System.out.println();
    }

    static int lcs(int i, int j) {
        if(i >= n) return 0;
        if(j >= m) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        int res = 0;
        // System.out.println(i+" "+j);

        indicies ind = new indicies(0,0);
        if(s1.charAt(i) == s2.charAt(j)) {
            // System.out.println("HERE");
            res = 1 + lcs(i + 1, j + 1);
            ind.i = i + 1;
            ind.j = j + 1;
        }

        int moves1 = lcs(i + 1, j);
        if(moves1 > res){
            res = moves1;
            ind.i = i + 1;
            ind.j = j;
        }

        int moves2 = lcs(i, j + 1);
        if(moves2 > res) {
            res = moves2;
            ind.i = i;
            ind.j = j + 1;
        }
        dp[i][j] = res;
        buildback[i][j] = ind;
        // for(int k = 0; k < n; k++) {
        //     System.out.println(Arrays.toString(dp[k]));
        // }        
        // System.out.println();
        return res;
    }
    static class indicies {
        int i, j;
        indicies(int i1, int j1) {
            i = i1;
            j = j1;
        }

        public String toString() {
            return i+" "+j;
        }
    }
}