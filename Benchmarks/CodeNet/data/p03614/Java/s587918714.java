/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] num = new int[n+1];
        int ans = 0;
        int piv = 1;
        num[0] = 10000000;
        for (int i = 1; i <= n; i++) {
            num[i] = sc.nextInt();
        }
        while(piv != n){
            if (num[piv] == piv) {
                if (num[piv+1] == piv+1) { //oo
                    num[piv] = piv+1;
                    num[piv+1] = piv;
                    piv++;
                    ans++;
                }else{                      //ox
                    num[piv+1] = piv+1;
                    piv++;
                    ans++;
                }
            } else {
                piv++;
            }
        }
        if (num[piv] == n) {
            ans++;
        }

        System.out.println(ans);

        sc.close();
    }

}