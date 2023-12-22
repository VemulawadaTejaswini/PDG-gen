import java.util.*;
class Takoyaki
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n,x,t,a,b,A;
    n=sc.nextInt();
    x=sc.nextInt();
    t=sc.nextInt();
    a=n%x;
    b=n/x;
    if(a==0)
    A=t*b;
    else
    A=t+t*b;
    
    System.out.println(A);
    sc.close();
  }
}