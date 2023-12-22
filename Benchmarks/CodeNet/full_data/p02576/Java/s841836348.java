import java.util.*;
public class Main
{
  public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int X=sc.nextInt();
    int T=sc.nextInt();
    int t=0;
   while(N>0) 
   {
     if(N<X)
     {
    System.out.print((t+T));
     break;
     }
     else
     {
       N=N-X;
       t=t+T;
     }
   }
  }
}
