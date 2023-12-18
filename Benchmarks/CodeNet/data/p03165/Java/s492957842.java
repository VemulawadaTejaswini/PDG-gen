import java.util.*;
import java.io.*;

class Main{

    static ArrayList<Character> answer = new ArrayList<>();
    /**
     * https://atcoder.jp/contests/dp/tasks/dp_f
     * Longest Common Subsequence.
    */
    
    static class Pair<T1, T2>{
        public T1 a;
        public T2 b;

        Pair(T1 a, T2 b){
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return this.a+"-"+this.b;
        }
    }

    private static void solver(String s, String t){

        int n = s.length();
        int m = t.length();

        Pair<Integer, Pair<Integer, Integer>>[][] dp = new Pair[n + 1][m + 1];

        for(int i=0; i<=n; i++){
                dp[i][0] = new Pair(0,  null);
        }
        for(int i=0; i<=m; i++){
            dp[0][i] = new Pair(0,  null);
        }


        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                dp[i][j] = new Pair(0, null);
                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    dp[i][j].a = dp[i - 1][j - 1].a + 1;
                    dp[i][j].b = new Pair(i - 1, j - 1);
                } else{
                    int l1 = dp[i - 1][j].a;
                    int l2 = dp[i][j - 1].a;
                    int max = l1 > l2 ? l1 : l2;
                    dp[i][j].a = max;
                    
                    Pair parent = l1 > l2 ? new Pair(i - 1, j): new Pair(i, j - 1);
                    dp[i][j].b = parent;
                }
            }
        }

        getPath(dp, n, m, s, t);
        
        for(int i = answer.size()-1 ; i>=0 ; --i){
            System.out.print(answer.get(i));
        }

        //return dp[n][m].toString();
    }

    private static void getPath(Pair<Integer, Pair<Integer, Integer>>[][] dp, int n, int m, String s, String t){

        if(dp[n][m].b == null){
            return;
        }

        if(s.charAt(n - 1) == t.charAt(m - 1)){
            answer.add(s.charAt(n - 1));
        }

        getPath(dp, dp[n][m].b.a, dp[n][m].b.b, s, t);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = in.next();
        String t = in.next();

        if(s=="" || t==""){
            System.out.println("");
            return;
        }

        solver(s, t);
    }
}