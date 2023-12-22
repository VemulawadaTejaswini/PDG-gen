import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    boolean f=false;
    for(int i=0;i<=x;i++)
    {
      int j=x-i;
      if(4*i+2*j==y)
        f=true;
    }
    if(f)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
