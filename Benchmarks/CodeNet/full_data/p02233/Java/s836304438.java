import java.util.*;
import java.io.*;

class Main{
  public static int n;
    public static void main(String[] args){
      try{
        BufferedReader fb = new BufferedReader(new InputStreamReader(System.in));
        String s;
        s = fb.readLine();
        n = Integer.parseInt(s);
        fb.close();
      }
      catch(IOException e){
        System.out.println(e);
      }
      System.out.println(fib(n));
    }
    public static int fib(int n){
      if(n == 0){
        return 1;
      }
      if(n == 1){
        return 1;
      }
      else{
        return fib(n-1) + fib(n-2);
      }
    }

}

