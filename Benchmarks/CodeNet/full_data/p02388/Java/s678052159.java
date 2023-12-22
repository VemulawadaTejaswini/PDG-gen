import java.lang.*;
import java.util.*;

class Main{
public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        double x = Math.pow(Integer.parseInt(in), 3);
        System.out.println((int)x);
        br.close();
  }
}