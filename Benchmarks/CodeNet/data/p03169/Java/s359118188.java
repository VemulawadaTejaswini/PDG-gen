import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
    static FastScanner sc = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static double dp[][][]=new double[301][301][301];
    public static double Ok(int x,int y,int z,int n){
        if(x==0 && y==0 && z==0) return 0;
        if(x<0 || y<0 || z<0) return 0;

        if(dp[x][y][z]!=-1) return dp[x][y][z];

        double op=n+x*Ok(x-1,y,z,n)+y*Ok(x+1,y-1,z,n)+z*Ok(x,y+1,z-1,n);

        return dp[x][y][z]=op/(x+y+z);
    }
    public static void Solve() throws Exception{

        int n =sc.nextInt();
        int x=0,y=0,z=0;
        for(int i=0;i<n;i++) {
            int x1 =sc.nextInt();
            if(x1==1) x++;
            if(x1==2) y++;
            if(x1==3) z++;
        }
        for(int i=0;i<301;i++){
            for(int j=0;j<301;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        // out.println(x+" "+y+" "+z);
        out.println(Ok(x,y,z,n));


    }
    public static void main(String args[]) throws Exception{
        
        Solve();
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


