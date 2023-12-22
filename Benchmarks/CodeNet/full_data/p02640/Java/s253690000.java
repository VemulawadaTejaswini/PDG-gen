import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          String[] str = br.readLine().split(" ");
          int X = Integer.parseInt(str[0]);
          int Y = Integer.parseInt(str[1]);

          int result = 0;
          boolean flag = false;

          Loop:for(int i = 0; i < X+1; i++){
            for(int j = 0; j < X+1; j++){
              result = i*2 + j*4;
              if(result == Y){
                flag = true;
                break Loop;
              }
            }
          }

          if(flag){
            System.out.println("Yes");
          }else{
            System.out.println("No");
          }
        }

    }
}