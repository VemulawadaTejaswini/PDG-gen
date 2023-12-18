import java.util.*;
class Main
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int z=0;
    double d=0.0;
    for(int i=0;i<a;i++)
    {
      z=sc.nextInt();
      d=d+(double)1/z;
      System.out.println(d);
    }
    d=1/d;
    System.out.println(d);
    }
}