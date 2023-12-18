import java.util.*;
import java.lang.*;
public class curtain
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int a,b,u;
    println("Enter width of the window");
    a=in.nextInt();
    println("Enter horizontal length of curtain");
    b=in.nextInt();
    u=a-(2*b);
    if(u>0)
      println("Uncovered portion is" +u);
    elseif(u==0)
    println("Uncovered portion is 0");
    elseif(a<2b)
    {
     println("Uncovered portion is 0");
    }
  }
}

    