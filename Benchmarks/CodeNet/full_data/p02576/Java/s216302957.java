import java.util.*;
import java.lang.*;
class Main
{
public static void main(String args[])
{
    Scanner obj=new Scanner(System.in);
    int n,x,t;double c=0;
    n=obj.nextInt();
    x=obj.nextInt();
    t=obj.nextInt();
  	double m=n;
    c=t*Math.ceil(m/x);
    System.out.println((int)c);
}
}