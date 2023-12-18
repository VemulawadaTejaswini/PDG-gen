import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String[] varity = br.readLine().split(" ");
        String[] str_f = br.readLine().split(" ");
        String[] str_m = br.readLine().split(" ");

        int A = Integer.parseInt(varity[0]);
        int B = Integer.parseInt(varity[1]);
        int M = Integer.parseInt(varity[2]);

        int[] freeze = new int[A];
        int[] microwave = new int[B];

        int min_f = 0;
        int min_m = 0;
        
        for(int i = 0; i < A; i++){
          freeze[i] = Integer.parseInt(str_f[i]);
          if(i == 0){
            min_f = freeze[i];
          }else{
            if(min_f > freeze[i]){
              min_f = freeze[i];
            }
          }
        }

        for(int i = 0; i < B; i++){
          microwave[i] = Integer.parseInt(str_m[i]);
          if(i == 0){
            min_m = microwave[i];
          }else{
            if(min_m > microwave[i]){
              min_m = microwave[i];
            }
          }
        }

        int num_f = 0;
        int num_m = 0;
        int sub = 0;
        int tmp = 0;
        int result = 0;

       for(int i = 0; i < M; i++){
         String[] input = br.readLine().split(" ");
         num_f = Integer.parseInt(input[0]);
         num_m = Integer.parseInt(input[1]);
         sub = Integer.parseInt(input[2]);

         tmp = freeze[num_f-1] + microwave[num_m-1] - sub;
    
         if(i == 0){
           result = tmp;
         }else{
           if(result > tmp){
             result = tmp;
           }
         }
       }
        
       if(result < min_f + min_m){
         System.out.println(result);
       }else{
         System.out.println(min_f+min_m);
       }
      }
    }
}