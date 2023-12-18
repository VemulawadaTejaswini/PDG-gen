package AtCoders;

import java.util.List;
import java.util.Scanner;

public class Main {
    static class Solution {

       // Map<Integer, Integer>
        public void find(String str) {
                int res = 0;
                for(int i = 0; i<str.length()-4; i++) {
                    String s1 = str.substring(i, i+4);
                    int val = Integer.parseInt(s1);
                    int rem = val%2019;
                    if(rem == 0) res++;
                    res += divisible(str, i+4, rem);
                }
                System.out.println(res);
        }

        int divisible(String str, int i, int rem) {
            int count = 0;
            for(int k=i; k<str.length(); k++) {
                int v1 = str.charAt(k) - '0';
                rem = (rem*10 + v1)%2019;
                if(rem == 0) {
                    count++;
                }

            }
            return count;
        }

//        int dfs(String str, int j, int rem) {
//            int count = 0;
//            if(rem % 2019 == 0) {
//                count = 1;
//            }
//            for(int k=j; k<str.length(); k++) {
//                int v1 = str.charAt(i) - '0';
//                rem = (rem*10 + v1)%2019;
//                if(rem == 0) {
//                    count++;
//                }
//
//            }
//        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sol.find(str);
    }
}

