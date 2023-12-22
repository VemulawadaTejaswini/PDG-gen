import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String[] input_n_m = br.readLine().split(" ");

        long N = Long.parseLong(input_n_m[0]);
        long M = Long.parseLong(input_n_m[1]);

        long[] height = new long[(int)N];
        String[] input_h = br.readLine().split(" ");

        for(int i = 0; i < N; i++){
          height[i] = Long.parseLong(input_h[i]);
        }

        long[][] table = new long[(int)N][(int)N];
        
        for(long i = 0; i < M; i++){
          String[] load = br.readLine().split(" ");
          long left = Integer.parseInt(load[0]);
          long right = Integer.parseInt(load[1]);

          table[(int)left-1][(int)right-1] = 1;
          table[(int)right-1][(int)left-1] = 1;
        }

        long count = 0;

        for(long i = 0; i < N; i++){
            long tmp_height = height[(int)i];
            long compare = 0;
            
            for(long j = 0; j < N; j++){
               if(table[(int)i][(int)j] == 1){
                 if(tmp_height <= height[(int)j]){
                   compare++;
                 }
               }else{
                 continue;
               }
            }

            if(compare == 0){
              count++;
            }

        }

        //System.out.println(Arrays.deepToString(table));
        System.out.println(count);
      }
    }
}