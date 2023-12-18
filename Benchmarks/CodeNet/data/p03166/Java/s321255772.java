import java.util.*;
import  java.io.*;
public class Main{

  public static void dfs(int n, int i, int [][]arr, int []ans , boolean vis[]){
    vis[i] = true;
    int max = 0 ;
    for(int k = 0 ; k < n ; k++){
      if(arr[i][k]==1){
        if(ans[k] != 0){
          max = Math.max(max, ans[k]+1);
        }else{
          if(vis[k] == false){
            dfs(n,k,arr,ans,vis);
            max = Math.max(max, ans[k]+1);
          }else{
            max = Math.max(max, ans[k]+1);
          }
        }
      }
    }
    ans[i] = max ;
  }

  public static int solute(int n, int m, int [][]arr, int []ans, boolean []vis){
    for(int i=0;i<n;i++){
      if(!vis[i]){
        dfs(n,i,arr,ans,vis);
      }
    }
    int max=0;
    for(int i=0;i<n;i++){
      max = Math.max(max, ans[i]);
    }
    return max ; 
  }
  public static void main(String []args) throws Exception{
    Reader obj = new Reader();
    int n = obj.nextInt();
    int m = obj.nextInt();

    int [][]arr=new int[n][n];
    int a , b;
    for(int i = 0 ; i < m ; i++){
      a = obj.nextInt()-1;
      b = obj.nextInt()-1;
      arr[a][b] = 1;
    }
    int []ans = new int[n];
    boolean []vis = new boolean[n];
    System.out.println(solute(n,m,arr,ans,vis));
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