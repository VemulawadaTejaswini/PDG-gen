import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader in;
//    static HashMap<Pair, Integer> map;
    static int[][] dp;
    static int M = (int)1e9+7;
    public static void solve() throws IOException {
        Integer[] nums = nextArray(2);
        char[][] arr = new char[nums[0]][nums[1]];
        for(int i = 0;i<nums[0];i++){
            arr[i] = in.readLine().toCharArray();
        }
//        map = new HashMap<>();
        dp = new int[nums[0]][nums[1]];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        int ans = recur(0,0, nums[0]-1,nums[1]-1, arr);
        System.out.println(ans);

    }

    static int recur(int x, int y, int H, int W, char[][] arr){
        if(x < H && y < W && dp[x][y] != -1)
            return dp[x][y];

        if(x == H && y == W){
            dp[x][y] = 1;
            return 1;
        }
        if(x>H || y > W||arr[x][y] == '#'){
            if(x < H && y < W)dp[x][y] = 0;
            return 0;
        }

        dp[x][y] = (recur(x+1,y,H,W,arr)+ recur(x,y+1,H,W,arr))%M;
        return dp[x][y];
    }


    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        solve();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(in.readLine().trim());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(in.readLine().trim());
    }

    static Integer[] nextArray(int n) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        Integer[] tmp = new Integer[n];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = Integer.parseInt(st.nextToken());
        }

        return tmp;
    }

}

