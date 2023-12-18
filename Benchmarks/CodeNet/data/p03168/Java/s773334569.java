import java.util.*;
import java.lang.*;
import java.io.*;
public class Main{
    static FastScanner sc = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    int ans=1;

    static double dp[][]=new double[3001][3001];

    public static double Ok(double arr[],int idx,int k){


        double op1=0,op2=0;
        if(idx>=arr.length){
            if(k==0) return 1;
            return 0;
        }
        if(dp[idx][k]!=-1){
            return dp[idx][k];
        }
        if(k>0){
            op1=(double)(arr[idx]*Ok(arr,idx+1,k-1));
        }
        op2=(double)((1-arr[idx])*Ok(arr,idx+1,k));   
        return dp[idx][k]=op1+op2;

    }

    public static void main(String args[]) throws Exception{
        int n=sc.nextInt();
        double arr[]=new double[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        for(int i=0;i<3001;i++){
            Arrays.fill(dp[i],-1d);
        }
        double ans=0;

        for(int k=n/2+1;k<=n;k++){
            ans+=Ok(arr,0,k);
        }

        out.println(ans);


        out.close();
    }  
    
}
class FastScanner
{

    final private int BUFFER_SIZE = 1 << 17;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public FastScanner(InputStream in)
    {
        din = new DataInputStream(in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }
    public String nextLine() throws Exception
    {
        StringBuffer sb = new StringBuffer("");
        byte c = read();
        while (c <= ' ') c = read();
        do
        {
            sb.append((char)c);
            c = read();
        }
        while(c > ' ');
        return sb.toString();
    }

    public char nextChar() throws Exception
    {
        byte c = read();
        while(c <= ' ') c = read();
        return (char)c;
    }

    public int nextInt() throws Exception
    {
        int ret = 0;
        byte c = read();
        while (c <= ' ') c = read();
        boolean neg = c == '-';
        if (neg) c = read();
        do
        {
            ret = ret * 10 + c - '0';
            c = read();
        }
        while (c > ' ');
        if (neg) return -ret;
        return ret;
    }

    public long nextLong() throws Exception
    {
        long ret = 0;
        byte c = read();
        while (c <= ' ') c = read();
        boolean neg = c == '-';
        if (neg) c = read();
        do
        {
            ret = ret * 10 + c - '0';
            c = read();
        }
        while (c > ' ');
        if (neg) return -ret;
        return ret;
    } 

    private void fillBuffer() throws Exception
    {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1) buffer[0] = -1;
    }

    private byte read() throws Exception
    {
        if (bufferPointer == bytesRead) fillBuffer();
        return buffer[bufferPointer++];
    }
    public double nextDouble() throws Exception
    {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();

        do
        {
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

    
}


