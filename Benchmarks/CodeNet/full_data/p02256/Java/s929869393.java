/* ALDS1_1_B */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String[] str = br.readLine().split(" ");
      int x = Integer.parseInt(str[0]);
      int y = Integer.parseInt(str[1]);

      System.out.println(GCD(x, y));

    }catch(Exception e){
      System.out.println(e);
    }
  }

  public static int GCD(int x, int y)
  {
    int gcd;
    if(x % y == 0){
      gcd = y;
    }else {
      gcd = GCD(y, (x % y));
    }

    return gcd;
  }
}