import java.io.*;
import java.util.*;

class Main {
  static class Reader 
  { 
      final private int BUFFER_SIZE = 1 << 16; 
      private DataInputStream din; 
      private byte[] buffer; 
      private int bufferPointer, bytesRead; 

      public Reader() 
      { 
          din = new DataInputStream(System.in); 
          buffer = new byte[BUFFER_SIZE]; 
          bufferPointer = bytesRead = 0; 
      } 

      public Reader(String file_name) throws IOException 
      { 
          din = new DataInputStream(new FileInputStream(file_name)); 
          buffer = new byte[BUFFER_SIZE]; 
          bufferPointer = bytesRead = 0; 
      } 

      public String readLine() throws IOException 
      { 
          byte[] buf = new byte[64]; // line length 
          int cnt = 0, c; 
          while ((c = read()) != -1) 
          { 
              if (c == '\n') 
                  break; 
              buf[cnt++] = (byte) c; 
          } 
          return new String(buf, 0, cnt); 
      } 

      public int nextInt() throws IOException 
      { 
          int ret = 0; 
          byte c = read(); 
          while (c <= ' ') 
              c = read(); 
          boolean neg = (c == '-'); 
          if (neg) 
              c = read(); 
          do
          { 
              ret = ret * 10 + c - '0'; 
          }  while ((c = read()) >= '0' && c <= '9'); 

          if (neg) 
              return -ret; 
          return ret; 
      } 

      public long nextLong() throws IOException 
      { 
          long ret = 0; 
          byte c = read(); 
          while (c <= ' ') 
              c = read(); 
          boolean neg = (c == '-'); 
          if (neg) 
              c = read(); 
          do { 
              ret = ret * 10 + c - '0'; 
          } 
          while ((c = read()) >= '0' && c <= '9'); 
          if (neg) 
              return -ret; 
          return ret; 
      } 

      public double nextDouble() throws IOException 
      { 
          double ret = 0, div = 1; 
          byte c = read(); 
          while (c <= ' ') 
              c = read(); 
          boolean neg = (c == '-'); 
          if (neg) 
              c = read(); 

          do { 
              ret = ret * 10 + c - '0'; 
          } 
          while ((c = read()) >= '0' && c <= '9'); 

          if (c == '.') 
          { 
              while ((c = read()) >= '0' && c <= '9') 
              { 
                  ret += (c - '0') / (div *= 10); 
              } 
          } 

          if (neg) 
              return -ret; 
          return ret; 
      } 

      private void fillBuffer() throws IOException 
      { 
          bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
          if (bytesRead == -1) 
              buffer[0] = -1; 
      } 

      private byte read() throws IOException 
      { 
          if (bufferPointer == bytesRead) 
              fillBuffer(); 
          return buffer[bufferPointer++]; 
      } 

      public void close() throws IOException 
      { 
          if (din == null) 
              return; 
          din.close(); 
      } 
  } 

  // static final Scanner in = new Scanner(System.in);
  static final Reader in = new Reader();
  static final PrintWriter out = new PrintWriter(System.out);
  static int N, K;

  static int[] a;
  static int dp[][];
  static final int MOD = 1000000007;
  static int pre[][];

  public static void main(String[] args) throws Exception {
    N = in.nextInt();
    K = in.nextInt();
    a = new int[N];
    dp = new int[N + 1][K + 1];
    pre = new int[N+1][K+1];

    for (int i = 0; i < N; i++) {
      a[i] = in.nextInt();
      Arrays.fill(dp[i], -1);
      

    }
    Arrays.fill(dp[N], -1);
    


    out.println(F(N-1, K));

    // out.println(Arrays.deepToString(dp));
    // out.println(Arrays.deepToString(pre));

    out.close();
  }

  static int F(int i, int k) {
    // System.out.println("\tat i == " + i + " k = " + k);
    if (i == 0) {
    //   System.out.println("\t\tat i == 0 k = "+k);
      if (k > a[0]) {
        // System.out.println("\t\treturning 0");
        dp[i][k] = 0;
        return 0;
      }
    //   System.out.println("\t\treturning 1");
      dp[i][k] = 1;
      return 1;
    }

    if (dp[i][k] != -1) return dp[i][k];

    int val = 0,j = 0;
    for (j = 0; j <= Math.min(k, a[i]); j++) {
    //   System.out.println("\t\tat i == " + i + " k = " + k + " j = " + j);
      if(dp[i][k - j] != -1) break;
      val += F(i-1, k - j) % MOD;
      val %= MOD;
    }

    if(k - j >= 0){ //..in case loop run at its full then k-j will be less than 0
        int r = pre[i][k-j];
        int l = 0;
        if(Math.min(k,a[i]) != k) 
            l = pre[i][k - a[i] - 1];
        val += r - l;
    }

    j--;
    for(;j >= 0;j--)
    {
        int prefix = 0;
        if(k - j - 1 >= 0)
            prefix = pre[i][k - j-1];
        
        pre[i][k - j] = prefix + dp[i][k-j];
    }
    
    // System.out.println("\t\tat i == " + i + " k = " + k + " F("+i+" , "+k+") = " + val);
    dp[i][k] = val % MOD;
    return dp[i][k];
  }
}
