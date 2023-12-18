import java.util.*;
import java.io.*;
public class Main {
    public static ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
    public static long dp[][];
    public static int mod = 1000000007;
 
    public static long solve(int node , int constraints , int pr){
        long ans = 0L;
 
        ArrayList<Integer> temp = tree.get(node);
 
        long w1 = 1L;
 
        if(dp[node][constraints] != -1){
            return dp[node][constraints];
        }
 
        for(int i = 0 ; i < temp.size() ; i++){
            if(temp.get(i) != pr){
                w1 = (w1 * solve(temp.get(i) , 0 , node))%mod;
            }
        }
 
        ans += w1;
        if(constraints == 0){
            long w2 = 1L;
            for(int i = 0 ; i < temp.size() ; i++){
                if(temp.get(i) != pr){
                    w2 = (w2 * solve(temp.get(i) , 1 , node))%mod;
                }
            }
            ans += w2;
        }
        return dp[node][constraints] = ans%mod;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
 
        for(int i = 0 ; i < n ; i++){
            tree.add(new ArrayList<Integer>());
        }
 
        dp = new long[n+1][3];
        for(int i = 0 ; i < n+1 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                dp[i][j] = -1;
            }
        }
 
        for(int i = 0 ; i < n-1 ; i++){
            int x = s.nextInt()-1;
            int y = s.nextInt()-1;
            tree.get(x).add(y);
            tree.get(y).add(x);
        }
 
        System.out.println(solve(0 , 0 , -1));
    }
}