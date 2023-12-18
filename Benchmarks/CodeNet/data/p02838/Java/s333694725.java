import java.io.*;
import java.util.*;

class Main{
    static int mod = 1000000007;
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        //for algorithim 
        long result = 0;
        long pow = 0;
        long tmp = 0;

        //algorithm
        for(int i = 0; i < 60; i++){
          long zero = 0;
          long one = 0;

          for(int j = 0; j < num; j++){
            if(((Long.parseLong(str[j]) >> i) & 1) == 0){
              zero++;
            }else{
              one++;
            }
          } 

          pow = (long)Math.pow(2.0, (double)i) % mod;
          tmp = (one * zero) * pow;
          result += tmp;
        }
        
        System.out.println(result % mod);

      }
    }
}