import java.util.*;
import java.lang.*;
import java.io.*;

class frog{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int w = scan.nextInt();

        int[] weight = new int[n];
        int[] value = new int[n];
        for (int i = 0; i < n; i++){
            weight[i] = scan.nextInt();
            value[i] = scan.nextInt();
        }

        long[] result = new long[11000];

        for (int i = 0; i < n; i++){
            for (int j = w; j >= 0; j--){
                if (j + weight[i] <= w){
                    result[j + weight[i]] = Math.max(result[j + weight[i]],result[j]+value[i]);
                }
               
            }
        }
        
        long res = (long)0;
        for (int i = 0; i < 11000; i++){
            res = Math.max(res,result[i]);
        }   
      

        System.out.println(res);

        scan.close();
    }
}   