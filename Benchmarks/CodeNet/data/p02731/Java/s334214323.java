import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int L = Integer.parseInt(br.readLine());
            double result = 0;
            double x = (double)(L/3);

            result = Math.pow(x, 3.0);

            System.out.println(result);
        }
   
    }
}