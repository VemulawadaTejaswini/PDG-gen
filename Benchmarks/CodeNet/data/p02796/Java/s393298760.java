import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        // input
        int N = Integer.parseInt(br.readLine());
        int max_index = 2000000000 + 1;

        int[] X_array = new int[N];
        int[] L_array = new int[N];
        
        for(int i = 0; i < N; i++){
          String[] tmp = br.readLine().split(" ");
          X_array[i] = Integer.parseInt(tmp[0]);
          L_array[i] = Integer.parseInt(tmp[1]);
        }

        //for algorithm
        int[] table = new int[max_index];
        Arrays.fill(table, 0);
        int result = 0;
        int max = 0;
        int min = 0;
        int search;

        for(int i = 0; i < N; i++){
          if(X_array[i] - L_array[i] < 0){
            min = 0;
          }else{
            min = X_array[i] - L_array[i];
          }

          if(X_array[i] + L_array[i] > max_index){
            max = max_index;
          }else{
            max = X_array[i] + L_array[i];
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