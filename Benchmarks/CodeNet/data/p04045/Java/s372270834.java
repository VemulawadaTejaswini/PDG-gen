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
        int k = sc.nextInt();
        int[] d = new int[k];
        for (int i = 0; i < k; i++) {
            d[i] = sc.nextInt();
        }

        abc042cIrohasObsessionSolve(n,k,d);

        sc.close();
    }

    public static void abc042cIrohasObsessionSolve(int n,int k,int[] d) {
        boolean bool = true;
        int boolcount = 0;
        while (bool) {
            for (int i = 0; i < k; i++) {
                if (Integer.toString(n).contains(Integer.toString(d[i]))){
                    boolcount++;
                }
            }
            if (boolcount == 0) {
                System.out.println(n);
                bool = false;
            }else{
                boolcount = 0;
            }
            n++;
        }
    }
    
}



