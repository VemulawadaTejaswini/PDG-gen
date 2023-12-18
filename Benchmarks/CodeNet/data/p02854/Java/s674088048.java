import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String num = br.readLine();
        String input = br.readLine();
        String[] input_array = input.split(" ");
        int result = 0;
        int[] int_array = new int[input_array.length];
        for(int i=0; i < input_array.length; i++){
          int_array[i] = Integer.parseInt(input_array[i]);
        }
        result = clac(int_array);
        System.out.println(result);
      }
    }

    static int clac(int[] a){
      int result = 0;
      int left = 0;
      int right = 0;
 
      for(int i = 0; i < a.length; i++){
        right = 0;
        left = left + a[i];
        for(int j = i + 1; j < a.length; j++){
          right = right + a[j];
        }
        if(i == 0){
          result = Math.abs((left - right));
        }else{
          if(result > Math.abs((left - right))){
            result = Math.abs((left - right));
          }
        }
      }

      return result;
    }
}