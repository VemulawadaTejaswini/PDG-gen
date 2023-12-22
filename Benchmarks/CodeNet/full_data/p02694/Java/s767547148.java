import java.util.*;
import java.math.*;
class Main{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    double x=in.nextDouble();
    x=x/100;
    double xx=(Math.log(1.01));
    double res=(Math.ceil(Math.log(x)/xx));
    System.out.print((int)res);
    
    
    
  }
}