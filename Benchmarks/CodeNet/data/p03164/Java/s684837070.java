import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    static FastScanner sc = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static long Ok(int wt[],int val[],int w,int start){
        int mat[][]=new int[2][w+1];

        for(int i=0;i<2;i++){
            Arrays.fill(mat[i],0);
        } 
        for(int i=0;i<val.length;i++){
            for(int j=0;j<w+1;j++){
                if(i%2!=0){
                    if(wt[i]<=j){
                        mat[1][j]=Math.max(val[i]+mat[0][j-wt[i]],mat[0][j]);
                    }
                    else{
                        mat[1][j]=mat[0][j];
                    }
                }
                else{
                    if(wt[i]<=j){
                        mat[0][j]=Math.max(val[i]+mat[1][j-wt[i]],mat[1][j]);
                    }
                    else{
                        mat[0][j]=mat[1][j];
                    }
                }
            }
        }
        // for(int i=0;i<2;i++){
        //     out.println(Arrays.toString(mat[i]));
        // }
        return (val.length%2!=0)?mat[0][w]:mat[1][w];
    }

    public static void main (String[] args) throws Exception {
        int n=sc.nextInt();
        int k=sc.nextInt();
        int wt[]=new int[n];
        int val[]=new int[n];

        for(int i=0;i<n;i++){
            wt[i]=sc.nextInt();
            val[i]=sc.nextInt();
        }

        out.println(Ok(wt,val,k,0));
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


