import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String[] input = br.readLine().split(" ");

        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]);

        double left = 0.0;
        double right = 0.0;

        left = Math.sqrt(a+b);
        right = Math.sqrt(c);

        //System.out.println(Math.sqrt(a));
        //System.out.println(Math.sqrt(a) * 2);
        //System.out.println(left);
        //System.out.println(right);
        if(left < right){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
    
      }
    }
}