import java.io.*;
import java.util.*;

public class Main
{
  public static void main(String[] args) { new Main(); }
  Scanner in = new Scanner(System.in);
  PrintWriter out = new PrintWriter(System.out);
  
  int n;
  int[] a, b;
  
  Main()
  {
    a = new int[1+(n = in.nextInt())];
    b = new int[n];
    for (int i = 0; i < n+1; i++) a[i] = in.nextInt();
    for (int i = 0; i < n; i++) b[i] = in.nextInt();
    
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
      if (b[i] > a[i]) 
      {
        sum += Math.min(b[i], a[i]+a[i+1]);
        a[i+1] -= (b[i]-a[i]);
      }
      else sum += b[i];
    }
    
    out.println(sum);
    out.close();
  }
}