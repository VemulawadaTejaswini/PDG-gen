import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int s,w;
    s=in.nextInt();
    w=in.nextInt();
    if(w>=s)
    {
      System.out.println("Unsafe");
      System.exit(0);
    }
    else
    {
      System.out.println("Safe");
    }
  }
}