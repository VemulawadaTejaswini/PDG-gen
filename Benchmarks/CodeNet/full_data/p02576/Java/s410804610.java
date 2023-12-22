import java.util.*;
class Takoyaki
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n,x,t,a,b;
    a=n%x;
    b=n/x;
    if(a!=0)
    t=t*b;
    else
      t=t+t*b;
    System.out.println(t);
  }
}