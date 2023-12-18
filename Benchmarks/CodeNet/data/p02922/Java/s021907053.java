import java.io.*;
import java.util.*;
 
class Main
{
  public static void main(String Args[])
  {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int ans=(int)Math.ceil((b-a)*1.0/(a-1))+1;
    
    System.out.println(ans);
  }
}