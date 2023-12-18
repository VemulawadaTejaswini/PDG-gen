import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //input
        String[] first_input = br.readLine().split(" ");
        int N = Integer.parseInt(first_input[0]);
        int K = Integer.parseInt(first_input[1]);

        String[] second_input = br.readLine().split(" ");
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < 3; i++){
          mp.put(i,Integer.parseInt(second_input[i]));
        }

        String[] t = br.readLine().split("");

        //for algorithm
        int result = 0;
        int tmp = 0;
        int K_tmp = 0;
        int prev = 0;
        int[] K_array = new int[K];

        for(int i = 0; i < N; i++){
          tmp = check_string(t, i);
          
          if(i < K){
            K_array[i] = tmp;
            result += mp.get(tmp);
          }else{
            prev = i % K;
            K_tmp = K_array[prev];

            if(tmp == K_tmp){
              tmp = check_string(t, i+K);
              
              if(tmp == 0){
                K_array[prev] = 1;
              }else if(tmp == 1){
                K_array[prev] = 0;
              }else{
                K_array[prev] = 0;
              }
              continue;
            }else{
              result += mp.get(tmp);
            }
            K_array[prev] = tmp;
          }
        }
        System.out.println(result);
      }
    }

  public static int check_string(String[] str, int i){
    int result = 0;
    
    if(str[i].equals("r")){
      result = 2;
    }else if(str[i].equals("s")){
      result = 0;
    }else if(str[i].equals("p")){
      result = 1;
    }

    return result;
  }
}