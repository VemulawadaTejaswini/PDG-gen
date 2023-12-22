import java.util.*;
import java.lang.*;
import java.io.*;
public class Main{
  public static void main(String agrs[])
  {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    long a = in.nextLong();
    double b = in.nextDouble();
    if((a * b) % 1 >= 0.5)
    {
      out.println((long)(a * b));
    }
    else
    {
      out.println((long)(a * b - 1));
    }
    out.close();
  }
}