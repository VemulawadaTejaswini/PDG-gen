import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        pie(sc.nextInt(), sc.nextInt()); 
    }
    


        public static int pie(int d, int L){
            int[] ans = new int[d];
            int sum = 0;
            for (int i = 1; i <= d; i++) {
                ans[i - 1] = L + i - 1;
            }
            //もとのアップルパイの味
            for (int j = 0; j < d; j++) {
                sum += ans[j];
            }
            //食べたあとのアップルパイの味
            //0のやつをたべる
            if (ans[0] > 0) {
                return sum - ans[0];
                
            }
            //０に近いものを食べる
            else if (ans[d-1] < 0) {
                return sum - ans[d - 1];
            }
            //０に近いものを食べる
            else{
                return sum;
            }
        }

    public static int pie2(int N, int L) {
        int z=0,sum=0,ans=0,ir=1,x=99999;
        while(z<N){
            sum+=z+L;
            z++;
        }z=0;
        while(z<N){
            if(sum-(sum-z-L)<0)
                ir=-1;
            if((sum-(sum-z-L))*ir<x){
                x=(sum-(sum-z-L))*ir;
                ans=sum-z-L;
            }
            ir=1;
            z++;
        }
        return ans;
    }
}
