import java.util.*;
import java.math.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner ob=new Scanner(System.in);
    double h=ob.nextInt();
    double a=ob.nextInt();
    double d=Math.ceil(h/a);
    int t=(int)d;
    System.out.println(t);
  }
}