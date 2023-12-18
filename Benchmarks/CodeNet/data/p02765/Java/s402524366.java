import java.util.*;
public class Sol
{
  public static void main(String args[])
  {
    Scanner d=new Scanner(System.in);
    int n,r,i;
    n=d.nextInt();
    r=d.nextInt();
    if(n<10)
      i=r+100*(10-n);
    else
      i=r;
    System.out.println(i);
  }
}