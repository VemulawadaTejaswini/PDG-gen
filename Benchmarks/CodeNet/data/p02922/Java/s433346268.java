import java.io.*;
import java.util.*;

class Main
{
  public static void main(String Args[])
  {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int ans=(int)Math.ceil(b*1.0/a);
    
    System.out.println(ans);
  }
}