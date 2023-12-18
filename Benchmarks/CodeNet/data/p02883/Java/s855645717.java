import java.util.*;
import java.io.*;

public class Main {
    static void swap(int [] a,int i,int j){
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
    static void shuffleSort(int a[],boolean reverse){
        Random r=new Random();
        for(int i=a.length-1;i>0;i--){
            int ind=r.nextInt(i);
            swap(a,ind,i);
        }
        Arrays.sort(a);
        if(reverse){
            int i=0,j=a.length-1;
            while(i<j){
                swap(a,i,j);
                i++;j--;
            }
        }
    }
    static boolean possible(int [] a,int [] b,long mid,long k){
        long cnt=0;
        for(int i=0;i<a.length;i++){
            long x=(long)a[i],y=(long)b[i];
            if((x*y)<=mid)continue;
            cnt+=x-(mid/y);
        }
        return cnt<=k;
    }
    public static void main(String [] args) throws IOException{
        FastScanner sc=new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt();
        long k=sc.nextLong();
        int [] a=sc.nextIntArray(n);
        int [] f=sc.nextIntArray(n);
        shuffleSort(a,true);
        shuffleSort(f,false);
        if(k==0){
            long max=0;
            for(int i=0;i<n;i++){
                max=Math.max(max,(long)a[i]*(long)f[i]);
            }
            out.println(max);
            out.close();
            return;
        }

        long l=0,r=(long)1e12;
        long ans=r;
        while(l<=r){
            long mid=(l+r)/2;
            if(possible(a,f,mid,k)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        out.println(ans);
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

