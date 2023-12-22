import java.util.*;
import java.io.*;

class Main{
  public static int n;
  public static int[] f;
    public static void main(String[] args){
      try{
        BufferedReader fb = new BufferedReader(new InputStreamReader(System.in));
        String s;
        s = fb.readLine();
        n = Integer.parseInt(s);
        f = new int[n+1];
        fb.close();
      }
      catch(IOException e){
        System.out.println(e);
      }
      System.out.println(fib(n));
    }
    public static int fib(int n){
      if(n <= 1){
        return f[n] = 1;
        }
      if(f[n] > 0){
        return f[n];
        }

      return f[n] = fib(n-1) + fib(n-2);
      }

}

