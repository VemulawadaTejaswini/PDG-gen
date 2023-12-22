import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          int N = Integer.parseInt(br.readLine());
          String[] num_s = br.readLine().split(" ");
          long[] num = new long[N];

          for(int i = 0; i < N; i++){
            num[i] = Long.parseLong(num_s[i]);
          }

          long result = 0;
          long cmp = 1000000000000000000L;

          for(int i = 0; i < N; i++){
            if(i == 0){
              result = num[i];
            }else{
              result *= num[i];
            }
          }

          if(result > cmp){
            System.out.println("-1");
          }else{
            System.out.println(result);
          }
        }
    }
}