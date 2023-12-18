import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String str_input = br.readLine();
        double input = Double.parseDouble(str_input);

        if(input < 1 || input > 100){
          System.exit(0);
        }

        /*奇数・偶数の確認*/
        if(input == 1){
          System.out.println(input);
        }else{
          if((input % 2) == 0){
            System.out.println((input/2)/input);
          }else{
            System.out.println(((input+1)/2)/input);
          }
        }
      }
    }
}