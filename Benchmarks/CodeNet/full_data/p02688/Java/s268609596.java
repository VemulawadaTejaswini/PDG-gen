import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          String[] input = br.readLine().split(" ");

          int N = Integer.parseInt(input[0]);
          int K = Integer.parseInt(input[1]);

          int[] result = new int[N];
          int d = 0;

          for(int i = 0; i < K; i++){
            d = Integer.parseInt(br.readLine());
            String[] tmp = br.readLine().split(" ");
           
            for(int j = 0; j < d; j++){
              result[Integer.parseInt(tmp[j])-1] += 1;
            }
          }

          int min = 0;
          int count = 0;

          for(int i = 0; i < result.length; i++){
            if(min > result[i]){
              min = result[i];
            }
          }


          for(int i = 0; i < result.length; i++){
            if(min == result[i]){
              count++;
            }
          }

          System.out.println(count);
      }
    }
}