import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.time.*;
import java.util.List;


//给出两个数a,b 求出[a,b]中各位数字之和能整除原数的数的个数。
public class Main {
    int[][] dirs = new int[][]{{0, -1}, {0, 1}, {1, 0}, {-1, 0}};

    int find_max(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    int sum(int[] arr, int md) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
            res %= mod;
        }
        return res;
    }

    long db(long sx, long mx, long xs) {//等比数列
        return (sx + mx) * xs / 2;
    }

    int mod = (int) 1e9 + 7;
    int mx = 0;
    long[] dp;

    ///int v = (int) 1e5;
    ///
    void solve(int n) {
        int[] res = new int[n+1];
        int x=1,y=1,z=1;
        for(int i=1;i<=80;i++){
            for(int j=1;j<=80;j++){
                for(int k=1;k<=80;k++){
                    int v = cnt(i,j,k);
                    if(v>n) break;
                    res[v]++;
                }
            }
        }

        for(int i=1;i<=n;i++){
            System.out.println(res[i]);
        }

    }
    int cnt(int x,int y,int z){
        return x*x+y*y+z*z+x*y+x*z+y*z;
    }



    public static void main(String[] args)  throws IOException {
        // Use the Scanner class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main test = new Main();
//        String[] s = br.readLine().split(" ");
//        int n = Integer.parseInt(s[0]);
//        int[] arr = new int[n];
//        s = br.readLine().split(" ");
//        for(int i=0;i<n;i++){
//            arr[i] = Integer.parseInt(s[i]);
//        }
        test.solve(Integer.parseInt(br.readLine()));
    }
}
