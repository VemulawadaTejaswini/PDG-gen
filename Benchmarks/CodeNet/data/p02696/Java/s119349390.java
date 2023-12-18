import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int n=sc.nextInt();
    int c=n;
    if(b-1<=n)
    {
      c=b-1;
    }
    
      System.out.println(Math.floor(a*c/b)-a*Math.floor(c/b));
     
  }