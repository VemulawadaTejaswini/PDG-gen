import java.util.*;
class Main
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int z=0;
    float d=0.0f;
    for(int i=0;i<a;i++)
    {
      z=sc.nextInt();
      d=d+(float)1/z;
    }
    d=1/d;
    System.out.println(d);
    }
}