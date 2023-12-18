import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          //input
          String[] input = br.readLine().split(" ");
          int N = Integer.parseInt(input[0]);
          int A = Integer.parseInt(input[1]);
          int B = Integer.parseInt(input[2]);

          //for output
          int result = 0;

          //for algorithm
          int dis_A = A - 1;
          int dis_B = N - B;
          int sub = B - A;

          //algorithm
          if((sub % 2) == 0){
            result = sub / 2;
          }else if(sub < 2){
            result = Math.min(dis_A, dis_B) + 1;
          }else{
            if(dis_A == 0 || dis_B == 0){
              result = 0;
            }else{
              if(dis_A < dis_B){
                result = dis_A;
                A = A - dis_A;
                B = B - dis_A;
              }else{
                result = dis_B;
                A = A + dis_B;
                B = B + dis_B;
              }
            }

            if(A > B){
              sub = A - B;
            }else{
              sub = B - A;
            }
            result += sub/2 + 1;
          }
           
          System.out.println(result);

        }

    }
}

