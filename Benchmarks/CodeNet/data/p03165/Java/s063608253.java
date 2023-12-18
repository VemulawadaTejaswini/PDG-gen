import java.util.*;
import java.io.*;
//267630EY
public class Main
{
  static PrintWriter out=new PrintWriter(System.out);

  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String t=sc.nextLine();
    
    int[][] dp=new int[s.length()+1][t.length()+1];
    
    for(int i=1;i<=s.length();i++)
    {
      for(int j=1;j<=t.length();j++)
      {
        if(s.charAt(i-1)==t.charAt(j-1))
        {
          dp[i][j]=dp[i-1][j-1]+1;
        }
        else
        {
          dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        }
      }
    }
    StringBuilder ans=new StringBuilder();
    int i=s.length();
    int j=t.length();
    while(dp[i][j]!=0)
    {
      if(s.charAt(i-1)==t.charAt(j-1))
      {
        ans.append(s.charAt(i-1));
        i--;
        j--;
      }
      else if(dp[i-1][j]>dp[i][j-1])
      {
        i--;
      }
      else
        j--;
    }
    ans.reverse();
    out.println(ans);
    out.flush();
        
        
   
      
      
                
    
  }
  
  static class Scanner
  {
    BufferedReader br;
    StringTokenizer tk=new StringTokenizer("");
    public Scanner(InputStream is) 
    {
      br=new BufferedReader(new InputStreamReader(is));
    }
    
    public boolean hasNext()
    {
      

      boolean result=false;
      
      try 
      {
        result = br.ready();
      } 
      catch (IOException e)
      {
        System.err.println(e);
      }
      return result;
    }
    
    public int nextInt() throws IOException
    {
      if(tk.hasMoreTokens())
        return Integer.parseInt(tk.nextToken());
      tk=new StringTokenizer(br.readLine());
      return nextInt();
    }
    public long nextLong() throws IOException
    {
      if(tk.hasMoreTokens())
        return Long.parseLong(tk.nextToken());
      tk=new StringTokenizer(br.readLine());
      return nextLong();
    }
    public String next() throws IOException
    {
      if(tk.hasMoreTokens())
        return (tk.nextToken());
      tk=new StringTokenizer(br.readLine());
      return next();
    }
    public String nextLine() throws IOException
    {
      tk=new StringTokenizer("");
      return br.readLine();
    }
    public double nextDouble() throws IOException
    {
      if(tk.hasMoreTokens())
        return Double.parseDouble(tk.nextToken());
      tk=new StringTokenizer(br.readLine());
      return nextDouble();
    }
    public char nextChar() throws IOException
    {
      if(tk.hasMoreTokens())
        return (tk.nextToken().charAt(0));
      tk=new StringTokenizer(br.readLine());
      return nextChar();
    }
    public int[] nextIntArray(int n) throws IOException
    {
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=nextInt();
      return a;
    }
    public long[] nextLongArray(int n) throws IOException
    {
      long a[]=new long[n];
      for(int i=0;i<n;i++)
        a[i]=nextLong();
      return a;
    }
    public int[] nextIntArrayOneBased(int n) throws IOException
    {
      int a[]=new int[n+1];
      for(int i=1;i<=n;i++)
        a[i]=nextInt();
      return a;
    }
    public long[] nextLongArrayOneBased(int n) throws IOException
    {
      long a[]=new long[n+1];
      for(int i=1;i<=n;i++)
        a[i]=nextLong();
      return a;
    }
  }
}

