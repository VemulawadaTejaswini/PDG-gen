import java.util.*;
import java.io.*;

class Main{

    //static ArrayList<Character> answer = new ArrayList<>();
    /**
     * https://atcoder.jp/contests/dp/tasks/dp_f
     * Longest Common Subsequence.
    */
    
    // generic pair class
    static class Pair<T1, T2>{
        public T1 first;
        public T2 second;

        Pair(T1 a, T2 b){
            this.first = a;
            this.second = b;
        }

        @Override
        public String toString() {
            return this.first+"-"+this.second;
        }
    }

    private static void solver(String s, String t){

        int n = s.length();
        int m = t.length();

        Pair<Integer, Pair<Integer, Integer>>[][] dp = new Pair[n + 1][m + 1];

        // initialize first row and first column with 0 for the length and null for parent.
        for(int i = 0; i <= n; i++)   dp[i][0] = new Pair(0,  null);
        for(int i = 0; i <= m; i++)   dp[0][i] = new Pair(0,  null);

        // iterate on dp
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){

                dp[i][j] = new Pair(0, null);
                
                // if a match
                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    dp[i][j].first = dp[i - 1][j - 1].first + 1; // +1 to the length
                    dp[i][j].second = new Pair(i - 1, j - 1);    // set parent

                } else{ // no match
                    int l1 = dp[i - 1][j].first; // get upper row cell's length
                    int l2 = dp[i][j - 1].first; // get left col cell's length
                    int max = l1 > l2 ? l1 : l2; // get max length
                    Pair<Integer, Integer> parent = l1 > l2 ? new Pair(i - 1, j): new Pair(i, j - 1);
                    
                    dp[i][j].first = max;     // set max length so far to current cell's length
                    dp[i][j].second = parent; // set parent 
                }
            }
        }

        getPath(dp, n, m, s, t);
        
        // for(int i = answer.size()-1 ; i>=0 ; --i){
        //     System.out.print(answer.get(i));
        // }
        //return dp[n][m].toString();
    }

    private static void getPath(Pair<Integer, Pair<Integer, Integer>>[][] dp, int n, int m, String s, String t){

        // hit first row or first column where i==0 or j==0
        if(dp[n][m].second == null)
            return;

        // get parent of current cell.
        getPath(dp, dp[n][m].second.first, dp[n][m].second.second, s, t);

        // match. add it to the array
        if(s.charAt(n - 1) == t.charAt(m - 1))
            System.out.print(s.charAt(n - 1));
            //answer.add(s.charAt(n - 1));

        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = in.next();
        String t = in.next();

        if(s == "" || t == ""){
            System.out.println("");
            return;
        }

        solver(s, t);
    }
}