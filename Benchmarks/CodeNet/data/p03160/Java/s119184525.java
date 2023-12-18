 import java.io.*;
import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.geom.*;
import java.math.*;
import java.text.*;
import java.math.BigInteger.*;
import java.util.Arrays; 

public class   ddddd
{
  BufferedReader in;
  StringTokenizer as;
  int nums[],nums2[];
  ArrayList < String > [] ar;
  
  public static void main (String[] args)
  {
    new ddddd  ();
  }
  
  
  public int GCD(int a, int b) {
    if (b==0) return a;
    return GCD(b,a%b);
  }
  
  public ddddd  ()
  {
    try
    {
      
      in = new BufferedReader (new InputStreamReader (System.in));
      int a = nextInt();
      nums = new int [a];
      nums2 = new int [a];
      for(int x = 0;x<a;x++)
      {
        nums[x] = nextInt();
      }
      nums2[0] = 0;
      nums2[1] = Math.abs(nums[1] - nums[0]);
      for(int x = 2;x<a;x++)
      {
        nums2[x] = Math.min(nums2[x-2] + Math.abs(nums[x] - nums[x-2]),nums2[x-1] + Math.abs(nums[x]-nums[x-1]));
      }
      System.out.println(nums2[a-1]);
    }
    
    catch(IOException e)
    {
      
    }
  }
  
  
  
  
  
  
  
  String next () throws IOException
  {
    while (as == null || !as.hasMoreTokens ())
    {
      as = new StringTokenizer (in.readLine ().trim ());
    }
    
    
    return as.nextToken ();
  }
  
  
  
  long nextLong () throws IOException
  {
    return Long.parseLong (next ());
  }
  
  
  int nextInt () throws IOException
  {
    return Integer.parseInt (next ());
  }
  
  
  double nextDouble () throws IOException
  {
    return Double.parseDouble (next ());
  }
  
  
  String nextLine () throws IOException
  {
    return in.readLine ().trim ();
  }
}