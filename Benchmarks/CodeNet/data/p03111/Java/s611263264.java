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

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] take = new int[n];
        int makeper = 0;
        int tmpcost  = 0;
        int cost = Integer.MAX_VALUE;
        int atake = 0;
        int btake = 0;
        int ctake = 0;
        int counta =0;
        int countb =0;
        int countc =0;

        for (int i = 0; i < n; i++) {
            take[i] = sc.nextInt();
        }

        for (int i = 0; i < Math.pow(4, n); i++) {
            String base4 = Integer.toString(makeper,4);
            
            while (base4.length() < n) {
                base4 = "0"+base4;
            }
                for (int j = 0; j < n; j++) {
                    if (base4.charAt(j) == '0'){

                    } else if (base4.charAt(j) == '1') {
                        atake += take[j];
                        counta++;
                    } else if (base4.charAt(j) == '2') {
                        btake += take[j];
                        countb++;
                    } else {
                        ctake += take[j];
                        countc++;
                    }
                }
                if(atake != 0 && btake != 0 && ctake != 0){
                    tmpcost += 10 * (counta + countb + countc -3);
                    tmpcost += Math.abs(atake - a) + Math.abs(btake - b) + Math.abs(ctake - c);
                    if (tmpcost < cost) {
                        cost = tmpcost;
                    }
                }
                tmpcost = 0;
                makeper++;
                counta = 0;
                countb = 0;
                countc = 0;
                atake = 0;
                btake = 0;
                ctake = 0;
        }

        System.out.println(cost);

        sc.close();
    }
    
    private static long gcd(Long m, long n) {
        if(m < n) {
            return gcd(n, m);
        }
        if(n == 0){
            return m;
        } 
        return gcd(n, m % n);
    }

    private static long[][] Combination_nCk(long n, long k) {
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
}