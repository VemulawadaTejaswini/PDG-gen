import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          String[] input = br.readLine().split(" ");
          String[] p = br.readLine().split(" ");

          int X = Integer.parseInt(input[0]);
          int N = Integer.parseInt(input[1]);

          int[] table = new int[101];

          if(N != 0){
            int[] str = new int[N];
            
            for(int i = 0; i < N; i++){
              str[i] = Integer.parseInt(p[i]);
            }
            
            for(int i = 0; i <=100; i++){
              table[i] = i;
            }
            
            for(int i = 0; i < N; i++){
                table[str[i]] = -1;
            }

            int i = X;
            int j = X;
            int result = 0;
            int count_i, count_j = 0;

            while(true){
              count_i = 0;
              count_j = 0;

              if(i != 100){
                i++;
              }
              if(j != 1){
                j--;
              }
              
              if(table[i] != -1){
                count_i = 1; 
              }
              if(table[j] != -1){
                count_j = 1;
              }

              if(count_i == 1 && count_j ==1){
                result = table[j];
                break;
              }else if(count_i == 1){
                result = table[i];
                break;
              }else if(count_j == 1){
                result= table[j];
                break;
              }
            }
            System.out.println(result);
          }else{
            System.out.println(X);
          }
        }

    }
}