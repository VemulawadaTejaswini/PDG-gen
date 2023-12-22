import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int a,b=0;
    b=2*m;
     //System.out.println(n+" "+m);
    for(int i=1;i<=m;i++)
    {
      System.out.println(i+" "+b);
      b--;
    }
  }
}
    