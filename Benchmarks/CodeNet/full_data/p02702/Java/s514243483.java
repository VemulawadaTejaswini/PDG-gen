

import java.util.List;
import java.util.Scanner;

public class Main {
    static class Solution {

       Integer[][]dp;
        public void find(String str) {
                int res = 0;
                dp = new Integer[str.length()+1][3000];
                for(int i = 0; i<str.length()-4; i++) {
                    String s1 = str.substring(i, i+4);
                    int val = Integer.parseInt(s1);
                    int rem = val%2019;
                    int count = 0;
                    if(rem == 0) count++;
                    count += dfs(str, i+4, rem);//divisible(str, i+4, rem);
                    dp[i+4][rem] = count;
                    res += count;
                }
                System.out.println(res);
        }

//        int divisible(String str, int i, int rem) {
//            int count = 0;
//            for(int k=i; k<str.length(); k++) {
//                int v1 = str.charAt(k) - '0';
//                rem = (rem*10 + v1)%2019;
//                if(rem == 0) {
//                    count++;
//                }
//
//            }
//            return count;
//        }

        int dfs(String str, int j, int rem) {

            int count = 0;
            if(rem % 2019 == 0) {
                count = 1;
            }
            if(j >= str.length()) return count;
            if(dp[j][rem] != null) {
                System.out.println("found");
                return dp[j][rem];
            }


            int v1 = str.charAt(j) - '0';
            rem = (rem*10 + v1)%2019;
            count += dfs(str, j+1, rem);
            dp[j][rem] = count;
            return count;

        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sol.find(str);
    }
}

