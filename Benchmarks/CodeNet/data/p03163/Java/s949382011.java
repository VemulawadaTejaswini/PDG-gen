import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int w = scan.nextInt();

        long[] weight = new long[n];
        long[] value = new long[n];
        for (int i = 0; i < n; i++){
            weight[i] = scan.nextInt();
            value[i] = scan.nextInt();
        }

        long[] result_weight = new long[n];
        long[] result_value = new long[n];

        result_weight[0] = weight[0];
        result_value[0] = value[0];
        
        for (int i = 1; i < n; i++){
            for (int j = 0; j < i; j++){
                
                if (result_weight[j] + weight[i] <= w){
                    if (result_value[j] + value[i] > result_value[i]){
                        result_weight[i] = result_weight[j] + weight[i];
                        result_value[i] = result_value[j] + value[i];
                    } 
                }else{
                    if (result_value[j] > result_value[i]){
                        result_value[i] = result_value[j];
                        result_weight[i] = result_weight[j];
                    }
                }

                if (weight[j] + weight[i] <= w){
                    if (value[j] + value[i] > result_value[i]){
                        result_weight[i]= weight[j] + weight[i];
                        result_value[i] = value[j] + value[i];
                    }
                }
            }
        }
        
      

        System.out.println(result_value[n - 1]);

        scan.close();
    }
}   