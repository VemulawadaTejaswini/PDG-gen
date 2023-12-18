import java.util.*;
public class game
{
  
  public static void main(String[] args)
  {
    Scanner ob=new Scanner(System.in);
    System.out.printltn("Enter two numbers");
    int a=ob.nextInt();
    int b=ob.nextInt();
    double d=Math.ceil(a/b);
    int t=(int)d;
    System.out.println(t);
  }
}