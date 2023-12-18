import java.util.*;
import  java.io.*;
public class Main{

  public static double solute(double arr[] , int i , int n, int cnt, double ans){
      if(i == n && cnt > (n/2)){
          return ans ; 
      }

      if(i == n && cnt <= n/2){
          return 0 ; 
      }

      return solute(arr,i+1,n,cnt+1,ans*arr[i]) + solute(arr,i+1,n,cnt,ans*(1.0 - arr[i])) ; 

  }

  public static double soluteBottomUp(double []a, int n){
      double [][]arr = new double[n+1][n+1];
      arr[0][0] = 1.0 ;
      for(int i = 1 ; i <= n ; i++){
          arr[i][0] = arr[i-1][0] * (1 - a[i-1]);
          arr[i][i] = arr[i-1][i-1] * a[i-1]; 
      }

      for(int i = 1 ; i <= n ; i++){
          for(int j = 1 ; j < i ; j++){
              arr[i][j] = a[i-1] * arr[i-1][j-1] + (1 - a[i-1]) * arr[i-1][j] ; 
          }
      }
      double ans = 0 ;
      for(int i = n/2+1 ; i <= n ; i++){
          ans += arr[n][i];
      }
      return ans ; 
  }
  
  public static void main(String []args) throws Exception{
    Reader obj = new Reader();
    int n = obj.nextInt();
    double []arr = new double[n];
    for(int i=0;i<n;i++){
        arr[i] = obj.nextDouble();
    }
    System.out.println(soluteBottomUp(arr,n));
  }


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


}
