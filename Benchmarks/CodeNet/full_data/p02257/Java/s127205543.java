/* ALDS1_1_C */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int count = 0;

      for(int i = 0; i < n; i++){
        long x = Long.parseLong(br.readLine());
        if(isprime(x)) count++;
      }
      System.out.println(count);

    }catch(Exception e){
      System.out.println(e);
    }
  }

  public static boolean isprime(long x)
  {
    if(x == 2) return true;
    if(x < 2 || x % 2 == 0) return false;

    int i = 3;
    while(i <= Math.sqrt(x)){
      if(x % i == 0) return false;
      i = i + 2;
    }

    return true;
  }
}