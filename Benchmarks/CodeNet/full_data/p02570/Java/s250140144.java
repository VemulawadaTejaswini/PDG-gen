import java.util.*;
import java.lang.*;

class Main{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    int d = sc.nextInt();
    int t = sc.nextInt();
    int s = sc.nextInt();
    double div = (double)((double)d/(double)s);
    if(div<=(double)t)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
}