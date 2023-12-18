import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //input
        String[] input = br.readLine().split(" ");
        
        long N = Long.parseLong(input[0]);
        long A = Long.parseLong(input[1]); //blue
        long B = Long.parseLong(input[2]); //red

        //for output
        long result = 0;

        //for algorithm
        long num = 0;
        long count = 0;

        while(true){
          if(count == 0){
            num += A;
            count++;
            if(num > N){
              result = N;
              break;
            }else{
              result += num;
            }
          }else{
            if((count % 2) != 0){
              num += B;
              count++;
              if(num > N){
                break;
              }else{
                continue;
              }
            }else if((count % 2) == 0){
              num += A;
              count++;
              if(num > N){
                result += A - (num - N);
                break;
              }else{
                result += A;
              }
            }
          }
        }
        
        System.out.println(result);
    
      }
    }
}