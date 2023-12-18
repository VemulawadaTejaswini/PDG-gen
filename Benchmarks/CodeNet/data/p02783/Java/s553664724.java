import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String[] input = br.readLine().split(" ");
        
        int H = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int result = 0;

        while(H > 0){
          H = H - A;
          result++;
        }
    
        System.out.println(result);
      }
    }
}