import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String[] input_n_m = br.readLine().split(" ");

        int N = Integer.parseInt(input_n_m[0]);
        int M = Integer.parseInt(input_n_m[1]);

        int[] height = new int[N];
        String[] input_h = br.readLine().split(" ");

        for(int i = 0; i < N; i++){
          height[i] = Integer.parseInt(input_h[i]);
        }

        int[][] table = new int[N][N];
        
        for(int i = 0; i < M; i++){
          String[] load = br.readLine().split(" ");
          int left = Integer.parseInt(load[0]);
          int right = Integer.parseInt(load[1]);

          table[left-1][right-1] = 1;
          table[right-1][left-1] = 1;
        }

        int count = 0;

        for(int i = 0; i < N; i++){
            int tmp_height = height[i];
            int compare = 0;
            
            for(int j = 0; j < N; j++){
               if(table[i][j] == 1){
                 if(tmp_height < height[j]){
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

        System.out.println(count);
      }
    }
}