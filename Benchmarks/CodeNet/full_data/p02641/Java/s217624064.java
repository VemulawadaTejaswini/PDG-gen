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

            int result_i = 0;
            int result_j = 0;
            int count_i = 0;
            int count_j = 0;
            boolean i_flag = false;
            boolean j_flag = false;
            
            for(int i = X; i <= 100; i++){
              count_i++;
              if(table[i] != -1){
                result_i = i;
                i_flag = true;
                break;
              }
            }

            for(int j = X; j >=1; j--){
              count_j++;
              if(table[j] != -1){
                result_j = j;
                j_flag = true;
                break;
              }
            }
            
            if(i_flag && j_flag){
            if(count_i == count_j){
              System.out.println(table[result_j]);
            }else if(count_i > count_j){
              System.out.println(table[result_j]);
            }else if(count_i < count_j){
              System.out.println(table[result_i]);
            }
            }else if(j_flag){
                System.out.println(table[result_j]);
            }else if(i_flag){
                System.out.println(table[result_i]);
            }

          }else{
            System.out.println(X);
          }
        }

    }
}