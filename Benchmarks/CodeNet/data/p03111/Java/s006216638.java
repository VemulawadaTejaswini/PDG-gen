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
        List<Integer> makea = new ArrayList<Integer>();
        List<Integer> makeb = new ArrayList<Integer>();
        List<Integer> makec = new ArrayList<Integer>();
        int tmpcost  = 0;
        int cost = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            take[i] = sc.nextInt();
        }

        for (int i = 0; i < Math.pow(4, n); i++) {
            String base4 = Integer.toString(makeper,4);
            while (base4.length() != n) {
                base4 += "0";
            }
                for (int j = 0; j < n; j++) {
                    if (base4.charAt(j) == '0'){
                        continue;
                    } else if (base4.charAt(j) == '1') {
                        makea.add(take[j]);
                    } else if (base4.charAt(j) == '2') {
                        makeb.add(take[j]);
                    } else {
                        makec.add(take[j]);
                    }
                }
                if (makea.size() == 0 ||makeb.size() == 0 ||makec.size() == 0) {
                    
                }else{
                    int atake = 0;
                    int btake = 0;
                    int ctake = 0;
                    for (int k = 0; k < makea.size(); k++) {
                        atake += makea.get(k);
                    }
                    for (int k = 0; k < makeb.size(); k++) {
                        btake += makeb.get(k);
                    }
                    for (int k = 0; k < makec.size(); k++) {
                        ctake += makec.get(k);
                    }
                    tmpcost += 10 * (makea.size()+makeb.size()+makec.size()-3);
                    tmpcost += Math.abs(atake - a) + Math.abs(btake - b) + Math.abs(ctake - c);
                }
                if (tmpcost < cost) {
                    cost = tmpcost;
                }
                tmpcost = 0;
                makeper++;
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