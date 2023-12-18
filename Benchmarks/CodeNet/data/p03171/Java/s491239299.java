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

  //..adjacency list for every node
  static List<Integer>[] adj;

  static int[] a;
  static long dp[][][];

  static class Pair {
    long curr_val, other_val;

    Pair(int L, int R) {
      curr_val = L;
      other_val = R;
    }

    @Override
    public String toString() {
      return "(" + curr_val + " , " + other_val + ")";
    }
  }

  public static void main(String[] args) throws Exception {
    N = in.nextInt();

    a = new int[N];

    for (int i = 0; i < N; i++) a[i] = in.nextInt();
    dp = new long[N][N][2];
    for(int i = 0;i < N;i++){
      for(int j = 0;j < N;j++)
        Arrays.fill(dp[i][j],-1);
    }

    out.println(F_topDown());
    out.close();
  }

  static long F_topDown(){
      //..base case fill all cells with (L == R) i.e. diagonal of dp matrix
      //..fill the diagonal of matrix of index 0
      for(int i = 0;i < N;i++)
          dp[i][i][0] = a[i];
      
     //..fill the matrix of index 1
      for(int i = 0;i < N;i++)
        dp[i][i][1] = -1 * a[i];

      for(int d = 1;d < N;d++){
        for(int L = 0;L < N-d;L++){
            int R = L+d;
            long left = dp[L+1][R][1] + a[L];
            long right = dp[L][R-1][1] + a[R];
            dp[L][R][0] = Math.max(left,right);
            
            left = dp[L+1][R][0] - a[L];
            right = dp[L][R-1][0] - a[R];
            dp[L][R][1] = Math.min(left,right);

        }
      }  

    
      return dp[0][N-1][0];
  }

  static long F(int L, int R,int player) {
    //..base case when there is only one element
    if (L == R) {
      //..if its player 0's turn score will be positive  
      if(player == 0) 
        return a[L];
      return -1 * a[L];  //..else it is negative score
    }

    //..if value already exists return directly
    if (dp[L][R][player] != -1) return dp[L][R][player];

    
    long val = 0;
    if(player == 0){ //..if it's player 0's turn
      long left = F(L+1,R,1) + a[L];
      long right = F(L,R-1,1) + a[R];
      val = Math.max(left, right);
    }
    else{
      long left = F(L+1,R,0) - a[L];
      long right = F(L,R-1,0) - a[R];
      val = Math.min(left, right);
    }

    dp[L][R][player] = val;
    return val;
  }

  // static void F() {
  //   for (int k = 1; k <= a[0] && k <= K; k++) {
  //     dp[k] = false;
  //   }

  //   for (int k = a[0]; k <= K; k++) {
  //     boolean win_state = false;
  //     for (int i = 0; i < N; i++) {
  //       if (k < a[i]) break;
  //       if (!dp[k - a[i]]) win_state = true;
  //     }
  //     dp[k] = win_state;
  //   }
  // }
}
