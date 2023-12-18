import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long w = s.nextLong();
        int val[] = new int[n];
        long wt[] = new long[n];
        for(int i = 0;i<n;i++){
            wt[i] = s.nextLong();
            val[i] = s.nextInt();
        }
        long res = findMaxVal(val, wt, w, n);
        System.out.println(res);
    }
    static long findMaxVal(int val[],long wt[],long w,int n){
        if(n == 0 || w == 0){
            return 0;
        }
        long max = 0;
        if(wt[n-1] > w){
            return findMaxVal(val,wt,w,n-1);
        }
        else{
            long option1 = val[n-1] + findMaxVal(val,wt,w-wt[n-1],n-1);
            long option2 = findMaxVal(val,wt,w,n-1);
            max = Math.max(option1,option2);
            System.out.println(max);
            return max;
        }

    }
}
