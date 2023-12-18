import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        int result = 0;

        String[] str = br.readLine().split(" ");

        for(int i=0; i < 3; i++){
          result = result + Integer.parseInt(str[i]);
        }

        if(result > 21){
          System.out.println("bust");
        }else{
          System.out.println("win");
        }
      }
    }
}