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
        long sub = 0;

        //algorithm
        while(true){
          if(A == 0 && B == 0){
            break;
          }else{
            count++;
            num = A * count + B * count;
            if(num > N){
              num -= (A + B);
              count--;
              break;
            }
          }
        }
        
        sub = N - num;

        if(sub < A){
          result += count * A + sub;
        }else{
            result += count * A + A;
        }
        
        System.out.println(result);
    
      }
    }
}