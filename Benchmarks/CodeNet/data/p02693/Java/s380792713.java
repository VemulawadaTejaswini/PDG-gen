import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int K = Integer.parseInt(br.readLine());
            String[] tmp = br.readLine().split(" ");
            int A = Integer.parseInt(tmp[0]);
            int B = Integer.parseInt(tmp[1]);

            int max = Math.max(A, B);
            int min = Math.min(A, B);
            int result = 0;

            for(int i = min; i <= max; i++){
              if((i%K) == 0){
                result = 1;
              }else{
                continue;
              }
            }

            if(result == 1){
              System.out.println("OK");
            }else{
              System.out.println("NG");
            }
        }
    }
}