import java.util.*;
import java.io.*;
//267630EY
public class Main
{
  static PrintWriter out=new PrintWriter(System.out);

  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int w=sc.nextInt();
    int[] val=new int[n];
    int[] weights=new int[n];
    int sum=0;
    for(int i=0;i<n;i++)
    {
      
      weights[i]=sc.nextInt();
      val[i]=sc.nextInt();
      sum+=val[i];
    }
    
   
    long[] dp=new long[sum+1];
    long INF=(long)10e15;
    Arrays.fill(dp,INF);
    
    dp[0]=0;
    for(int i=0;i<n;i++)
    {
      for(int j=sum;j>=val[i];j--)
      {
        dp[j]=Math.min(dp[j],dp[j-val[i]]+(long)weights[i]);
      }
    }
    long ans=0;
    for(int i=sum;i>=0;i--)
    {
      if(dp[i]<=w)
      {
        ans=i;
        break;
      }
    }
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

