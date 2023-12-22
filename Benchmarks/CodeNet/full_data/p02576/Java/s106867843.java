import java.util.*;
class sun
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),x=sc.nextInt(),t=sc.nextInt();
    int a=(int)Math.ceil(n/x);
    System.out.println(a*t);
  }
}