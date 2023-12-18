import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    String st1=s.next();
    String st2=s.next();
    int a=s.nextInt();
    int b=s.nextInt();
    String st3=s.next();
    if(st3.equals(st1))
      a--;
    else
      b--;
    System.out.println(a+" "+b);
  }
}
