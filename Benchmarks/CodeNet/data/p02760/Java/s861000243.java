import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //for input
        int[][] table = new int[8][3];

        for(int i = 0; i < 3; i++){
          String[] input = br.readLine().split(" ");
          table[i][0] = Integer.parseInt(input[0]);
          table[i][1] = Integer.parseInt(input[1]);
          table[i][2] = Integer.parseInt(input[2]);

          if(i == 0){
            table[3][0] = Integer.parseInt(input[0]);
            table[4][0] = Integer.parseInt(input[1]);
            table[5][0] = Integer.parseInt(input[2]); 
            table[6][0] = Integer.parseInt(input[0]);
            table[7][0] = Integer.parseInt(input[2]);
          }else if(i == 1){
            table[3][1] = Integer.parseInt(input[0]);
            table[4][1] = Integer.parseInt(input[1]);
            table[5][1] = Integer.parseInt(input[2]); 
            table[6][1] = Integer.parseInt(input[1]);
            table[7][1] = Integer.parseInt(input[1]);
          }else if(i == 2){
            table[3][2] = Integer.parseInt(input[0]);
            table[4][2] = Integer.parseInt(input[1]);
            table[5][2] = Integer.parseInt(input[2]); 
            table[6][2] = Integer.parseInt(input[2]);
            table[7][2] = Integer.parseInt(input[0]);
          }
        }

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
          int num = Integer.parseInt(br.readLine());

          for(int j = 0; j < 8; j++){
             for(int t = 0; t < 3; t++){
               if(num == table[j][t]){
                 table[j][t] = -1;
               }
             }
          }
        }

        int result = 0;
        int count = 0;

        for(int i = 0; i < 8; i++){
          count = 0;
          for(int j = 0; j < 3; j++){
            if(table[i][j] == -1){
              count++;
              if(count == 3){
                result++;
              }
            }else{
              continue;
            }
          }
        }

        if(result == 0){
          System.out.println("No");
        }else{
          System.out.println("Yes");
        }

        System.out.println(Arrays.deepToString(table));
        System.out.println(result);
      }
    }
}