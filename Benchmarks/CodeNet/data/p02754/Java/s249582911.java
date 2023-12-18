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
        long count = 0;
        long sub = 0;

        //algorithm
        if(A == 0 && B == 0){
          count = -1;
        }else if(A == 0){
          count = -1;
        }else if(B == 0){
          if(A > N){
            sub = N;
            count = -2;
          }else{
            for(long i = 1; (i*A) < N; i++){count++;}
          }
        }else{
          if(A + B >= N){
            sub = A;
            count = -3;
          }else{
            for(long i = 1; (i*A + i*B) < N; i++){count++;}
          }
        }
        
        if(count == -1){
          result = 0;
        }else if(count == -2){
          result = sub;
        }else if(count == -3){
          result = A;
        }else{
          if(count != 0){
            sub = N - (A*count + B*count);
            if(sub > A){
              result = A*count  + A;
            }else{
              result = A*count  + sub;
            }
          }
        }
        
        System.out.println(result);
    
      }
    }
}