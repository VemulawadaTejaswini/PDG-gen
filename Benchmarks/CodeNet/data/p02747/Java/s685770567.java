import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String input = br.readLine();
        boolean flag = false;

        if(input.isEmpty()){
          flag = true;
        }

        if(input.contains("hi")){
          input = input.replace("hi", "");
        }

        if(input.isEmpty()){
          if(flag){
            System.out.println("No");
          }else{
            System.out.println("Yes");
          }
          
        }else{
          System.out.println("No");
        }

        }
      }
}