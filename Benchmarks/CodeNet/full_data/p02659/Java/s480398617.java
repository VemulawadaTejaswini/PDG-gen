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
    out.println((long)(a * b));
    out.close();
  }
}