import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner ob=new Scanner(System.in);
    int h=ob.nextInt();
    int k=1;
    int c=0;
    while(h>0)
    {
      c=c+k;
      h=h/2;
      k=k*2;
    }
    System.out.println(c);
  }
}