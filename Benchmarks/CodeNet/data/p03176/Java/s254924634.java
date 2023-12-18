import java.util.*;
import java.io.*;

class Main {
    public static int lengthofLIS(int[] nums, int previndex, int curpos, int[][] memo,int[] price) {
        if (curpos == nums.length) {
            return 0;
        }
        if (memo[previndex + 1][curpos] >= 0) {
            return memo[previndex + 1][curpos];
        }
        int taken = 0;
        if (previndex < 0 || nums[curpos] > nums[previndex]) {
            taken = price[curpos] + lengthofLIS(nums, curpos, curpos + 1, memo,price);
        }

        int nottaken = lengthofLIS(nums, previndex, curpos + 1, memo,price);
        memo[previndex + 1][curpos] = Math.max(taken, nottaken);
        return memo[previndex + 1][curpos];
    }


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str  = new StringTokenizer(br.readLine(), " ");
        int[] flowers = new int[n];
        int i = 0;
        while(str.hasMoreTokens()){
            flowers[i] = Integer.parseInt(str.nextToken());
            i++;
        }
        i = 0;
        int[] price = new int[n];
        str  = new StringTokenizer(br.readLine(), " ");
        while(str.hasMoreTokens()){
            price[i] = Integer.parseInt(str.nextToken());
            i++;
        }
        i = 0;
        // // /long[][] memo = new long[price.length+1][price.length+1];
        // for(i = 0; i < price.length; i++)
        //     Arrays.fill(memo[i],-1);

        //solve3(flowers,price);
        int memo[][] = new int[price.length + 1][price.length];
        for (int[] l : memo) {
            Arrays.fill(l, -1);
        }
    System.out.print(lengthofLIS(flowers, -1, 0, memo,price));
         
    }
}
// 4
// 4 2 5 8 
// 6 8 8 4 