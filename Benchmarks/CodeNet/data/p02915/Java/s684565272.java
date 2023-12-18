import java.io.*;
import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.geom.*;
import java.math.*;
import java.text.*;
import java.math.BigInteger.*;
import java.util.Arrays; 

public class   Main
{
  BufferedReader in;
  StringTokenizer as;
  int nums[],nums2[];
  int[] nums1[];
  boolean con = true;
  
  ArrayList < Integer >  ar = new ArrayList < Integer >();
  ArrayList < Integer >  fi = new ArrayList < Integer >();
  Map<Integer,Integer > map = new HashMap<Integer, Integer>();
  public static void main (String[] args)
  {
    new Main  ();
  }
  
  public int GCD(int a, int b) {
    if (b==0) return a;
    return GCD(b,a%b);
  }
  
  public int LIS(int arr[])
  {
    int n = arr.length;
    int sun[] = new int [n];
    int cur = 0;
    for(int x = 0;x<n;x++)
    {
      int temp = Arrays.binarySearch(sun,0,cur,arr[x]);
      if(temp < 0)
        temp = -temp -1;
      sun[temp] = arr[x];
      if(temp == cur)
        cur++;
    }
    return cur;
    
  }
  
  
  
  
  public Main  ()
  {
    try
    {
      
      in = new BufferedReader (new InputStreamReader (System.in));
      int a = nextInt();
      System.out.println((int)Math.pow(a,3));
      
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