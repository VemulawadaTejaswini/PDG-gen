/*
* Author. Silviase(@silviasetitech)
* For AtCoder
*/

import java.util.*;
import java.lang.*;
import java.math.*;


public class Main {

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        /*
        // initialization and input start
        */

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[100001];
        int[] aruiseki = new int[100001];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int tmpa = sc.nextInt();
            int tmpb = sc.nextInt();
            a[tmpa] += tmpb;
        }
        for (int i = 0; i < aruiseki.length-1; i++) {
            aruiseki[i+1] = aruiseki[i] + a[i+1];
            if (aruiseki[i] >= k) {
                ans = i;
                break;
            }
        }


        /*
        // initialization and input end
        // start solving
        */

        System.out.println(ans);
        
        /*
        // solving end
        // start output
        */


        // end

        sc.close();
    }


    public static long gcd(Long m, long n) {
        if(m < n) {
            return gcd(n, m);
        }
        if(n == 0){
            return m;
        } 
        return gcd(n, m % n);
    }

    public static long[][] Combination_nCk(long n, long k) {
        n++; k++;
        long[][] ans = new long[(int)n][(int)k];
        for (int i = 0; i < n; i++) {
            ans[i][0] = 1;
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < k-1; j++) {
                if (i < j) {
                    ans[i][j] = 0;
                }else{
                    ans[i+1][j+1] = ans[i][j] + ans[i][j+1];
                }
            }
        }
        return ans;
    }

    public static double[][] Probability_nCk(int n, int k) {
        n++; k++;
        double[][] ans = new double[n][k];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans[i][0] = 1;
            }else{
                ans[i][0] = ans[i-1][0]/2;
            }
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < k-1; j++) {
                if (i < j) {
                    ans[i][j] = 0;
                }else{
                    ans[i+1][j+1] = (ans[i][j] + ans[i][j+1])/2;
                }
            }
        }
        return ans;
    }
}