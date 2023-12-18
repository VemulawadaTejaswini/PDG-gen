import java.util.*;
import java.io.*;
public class Main {
    public static int dp[];
    public static int getLen(ArrayList<ArrayList<Integer>> arr , int s){
        if(dp[s] != -1){
            return dp[s];
        }
        int ans = 0;
        for(int j = 0 ; j < arr.get(s).size() ; j++){
            int temp = arr.get(s).get(j);
            
            ans = Math.max(ans , getLen(arr , temp) + 1);
        }

        // System.out.println(ans);
        return dp[s] = ans;
    }
    public static int solve(ArrayList<ArrayList<Integer>> arr){
        int ans = 0;
        for(int i = 0 ; i < arr.size() ; i++){
            ans = Math.max(ans , getLen(arr , i));
        }
        // ans = getLen(arr , 4);
        return ans;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        dp = new int[n];

        for(int i = 0 ; i < n ; i++){
            dp[i] = -1;
        }
        
        // int arr[][] = new int[n][n];

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            arr.add(new ArrayList<Integer>());
        }

        for(int i = 0 ; i < m ; i++){
            int first = s.nextInt() - 1;
            int second = s.nextInt() - 1;
            // arr[first][second] = 1;
            arr.get(first).add(second);
        }
        
        System.out.println(solve(arr));
        // for(int i = 0 ; i < n ; i++){
        //     System.out.println(dp[i]);
        // }
    }
}