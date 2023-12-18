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
      nums = new int [a];
      long tot = 0;
      for(int x = 0;x<a;x++)
      {
        nums[x] = nextInt();
      }
      for(int x = 0;x<a;x++)
      {
        int point1 = -1;
        int point2 = -1;
        int point3 = -1;
        int point4 = -1;
        for(int x1 = x-1;x1>=0;x1--)
        {
          if(nums[x1] > nums[x])
          {
            if(point1 == -1)
              point1 = x1;
            else if(point2 == -1)
              point2 = x1;
            else
              break;
          }
        }
        for(int x1 = x+1;x1<a;x1++)
        {
          if(nums[x1] > nums[x])
          {
            if(point3 == -1)
              point3 = x1;
            else if(point4 == -1)
              point4 = x1;
            else
              break;
          }
        }

        if(point1 != -1)
        {
          long dist = 0;
          if(point2 == -1)
            dist = point1 +1;
          else
            dist = point1 - point2 ;
          dist = dist * nums[x];
          if(point3 == -1)
            tot += dist * (a-x);
          else
            tot += dist * (point3 - x);
        }
        if(point3 != -1)
        {
          long dist = 0;
          if(point4 == -1)
            dist = a - point3;
          else
            dist = point4 - point3;
          dist = dist * nums[x];
          if(point1 == -1)
            tot += dist * (x+1);
          else
            tot += dist * (x - point1);
        }
    //   System.out.println(point1 + " " + point2 + " " + x + " " + tot);
      
      }
      System.out.println(tot);
      
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