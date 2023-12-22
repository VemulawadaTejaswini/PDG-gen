import java.util.*;
import java.lang.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int legs=sc.nextInt();
    double val=((4*n)-legs)/2;
    int ans=Math.floor(val);
    if(val>0 && val-ans==0)
      System.out.println("Yes");
    else
      System.out.println("No");
    
  }
}