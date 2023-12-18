import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        // input
        int N = Integer.parseInt(br.readLine());

        int[] X_array = new int[N];
        int[] L_array = new int[N];
        int max_index = 0;
        
        for(int i = 0; i < N; i++){
          String[] tmp = br.readLine().split(" ");
          X_array[i] = Integer.parseInt(tmp[0]);
          L_array[i] = Integer.parseInt(tmp[1]);

          if(max_index < Integer.parseInt(tmp[0])){
            max_index = Integer.parseInt(tmp[0]);
          }
        }

        //for algorithm
        int[] table = new int[max_index+1];
        Arrays.fill(table, 0);
        int result = 0;
        int max = 0;
        int min = 0;
        int search;

        for(int i = 0; i < N; i++){
          if(X_array[i] - L_array[i] < 0){
            min = 0;
          }else{
            min = X_array[i] - L_array[i] + 1;
          }

          if(X_array[i] + L_array[i] > max_index){
            max = max_index;
          }else{
            max = X_array[i] + L_array[i] - 1;
          }
          
          search = Arrays.binarySearch(table, min, max, 1);
          if(search >= 0){
            continue;
          }else{
            result++;
            Arrays.fill(table, min, max, 1);
          }
        }
        
        System.out.println(result);
      }
    }
}