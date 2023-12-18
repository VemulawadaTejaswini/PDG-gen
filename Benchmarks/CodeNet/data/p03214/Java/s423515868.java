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
        int[] fl = new int[n];
        double av = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            fl[i] = sc.nextInt();
            av += fl[i];
        }
        av/=n;

        for (int i = 0; i < n; i++) {
            if (Math.abs( av-fl[ans] ) > Math.abs( av-fl[i] )  ) {
                ans = i;
            }
        }

        System.out.println(ans);

        sc.close();
    }

}