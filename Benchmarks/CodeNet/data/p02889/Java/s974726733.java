import java.util.*;
import java.io.*;

public class Main {
  
    static int inf=Integer.MAX_VALUE;
    public static void main(String [] args) throws IOException{
        FastScanner sc=new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int l=sc.nextInt();
        long [][] a=new long[n+1][n+1];
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();
            a[u][v]=w;
            a[v][u]=w;
        }

        long [][] dist=new long[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j)dist[i][j]=0;
                else if(a[i][j]!=0)dist[i][j]=a[i][j];
                else dist[i][j]=inf;
            }
        }
        
        for(int k=1;k<=n;k++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(dist[i][k]!=inf && dist[k][j]!=inf)
                    dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                }
            }
        }

        long [][] sdist=new long[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j)sdist[i][j]=0;
                else if(dist[i][j]<=l)sdist[i][j]=1;
                else sdist[i][j]=inf;
            }
        }

         
        for(int k=1;k<=n;k++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(sdist[i][k]!=inf && sdist[k][j]!=inf)
                    sdist[i][j]=Math.min(sdist[i][j],sdist[i][k]+sdist[k][j]);
                }
            }
        }

        int q=sc.nextInt();
        StringBuilder sb=new StringBuilder("");
        while(q-->0){
            int u=sc.nextInt();
            int v=sc.nextInt();
            if(sdist[u][v]==inf)sb.append(-1+"\n");
            else sb.append((sdist[u][v]-1)+"\n");
        }
        out.println(sb.toString().trim());
        out.close();
    }
}






























class FastScanner{	
    private int BUFFER_SIZE = 1 << 16;
   
   private  DataInputStream din;
   
   private  byte[] buffer;
   
   private int bufferPointer, bytesRead;
   
   public FastScanner() {
       din = new DataInputStream(System.in);
       buffer = new byte[BUFFER_SIZE];
       bufferPointer = bytesRead = 0;
   }

   public FastScanner( String file_name) throws IOException {
       din = new DataInputStream(new FileInputStream(file_name));
       buffer = new byte[BUFFER_SIZE];
       bufferPointer = bytesRead = 0;
   }
   
   public String readLine() throws IOException {
        byte[] buf = new byte[64];
       int cnt = 0, c;
       while ((c = read()) != -1) {
           if (c == '\n')
               break;
           buf[cnt++] = (byte) c;
       }
       return new String(buf, 0, cnt);
   }
   
   public String next() throws IOException{

       byte c = read();
       while(Character.isWhitespace(c)){
           c = read();
       }
       
        StringBuilder builder = new StringBuilder();
       builder.append((char)c);
       c = read();
       while(!Character.isWhitespace(c)){
           builder.append((char)c);
           c = read();
       }
       
       return builder.toString();
   }

   public int nextInt() throws IOException {
       int ret = 0;
       byte c = read();
       while (c <= ' ')
           c = read();
        boolean neg = (c == '-');
       if (neg)
           c = read();
       do {
           ret = ret * 10 + c - '0';
       } while ((c = read()) >= '0' && c <= '9');

       if (neg)
           return -ret;
       return ret;
   }
   
   public int[] nextIntArray( int n) throws IOException {
        int arr[] = new int[n];
       for(int i = 0; i < n; i++){
           arr[i] = nextInt();
       }
       return arr;
   }

   public long nextLong() throws IOException {
       long ret = 0;
       byte c = read();
       while (c <= ' ')
           c = read();
        boolean neg = (c == '-');
       if (neg)
           c = read();
       do {
           ret = ret * 10 + c - '0';
       } while ((c = read()) >= '0' && c <= '9');
       if (neg)
           return -ret;
       return ret;
   }
   
   public long[] nextLongArray( int n) throws IOException {
        long arr[] = new long[n];
       for(int i = 0; i < n; i++){
           arr[i] = nextLong();
       }
       return arr;
   }

   public char nextChar() throws IOException{
       byte c = read();
       while(Character.isWhitespace(c)){
           c = read();
       }
       return (char) c;	
   }
   
   public double nextDouble() throws IOException {
       double ret = 0, div = 1;
       byte c = read();
       while (c <= ' ')
           c = read();
        boolean neg = (c == '-');
       if (neg)
           c = read();

       do {
           ret = ret * 10 + c - '0';
       } while ((c = read()) >= '0' && c <= '9');

       if (c == '.') {
           while ((c = read()) >= '0' && c <= '9') {
               ret += (c - '0') / (div *= 10);
           }
       }

       if (neg)
           return -ret;
       return ret;
   }
   
   public double[] nextDoubleArray( int n) throws IOException {
        double arr[] = new double[n];
       for(int i = 0; i < n; i++){
           arr[i] = nextDouble();
       }
       return arr;
   }

   private void fillBuffer() throws IOException {
       bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
       if (bytesRead == -1)
           buffer[0] = -1;
   }

   private byte read() throws IOException {
       if (bufferPointer == bytesRead)
           fillBuffer();
       return buffer[bufferPointer++];
   }

   public void close() throws IOException {
       if (din == null)
           return;
       din.close();
   }

}

