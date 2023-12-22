//package Div2_655;

import java.io.*;

public class Main {
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
    static char c[][];
    static boolean visited[][];
    static int dp[][];
    static int m,n,dh,dw;
    public static void main(String[] args)throws IOException {
        Reader s=new Reader();
        m=s.nextInt();
        n=s.nextInt();
        int ch=s.nextInt()-1;
        int cw=s.nextInt()-1;
        dh=s.nextInt()-1;
        dw=s.nextInt()-1;
        c=new char[m][n];
        for(int i=0;i<m;i++){
            c[i]=s.readLine().toCharArray();
        }
        visited=new boolean[m][n];
        dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(c[i][j]=='#'){
                    visited[i][j]=true;
                    dp[i][j]=Integer.MAX_VALUE/1000;
                }
            }
        }
        dfs(ch,cw);
        if(dp[ch][cw]!=Integer.MAX_VALUE/1000)
        System.out.println(dp[ch][cw]);
        else{
            System.out.println(-1);
        }
    }
    public static void dfs(int x,int y){
        visited[x][y]=true;
//        System.out.println(x+" "+y);
        if(x==dh&&y==dw){
            return;
        }
        dp[x][y]=Integer.MAX_VALUE/1000;
        for(int i=-2;i<=2;i++){
            for(int j=-2;j<=2;j++){
                int cx=x+i,cy=y+j;
                if(isValid(cx,cy)&&!visited[cx][cy]){
                    dfs(cx,cy);
                }
                if(isValid(cx,cy)) {
                    if (i == 0 && (j == -1 || j == 1)) {
                        dp[x][y] = Math.min(dp[x][y], dp[cx][cy]);
                    } else if (j == 0 && (i == -1 || i == 1)) {
                        dp[x][y] = Math.min(dp[x][y], dp[cx][cy]);
                    } else {
                        dp[x][y] = Math.min(dp[x][y], dp[cx][cy] + 1);
                    }
                }
            }
        }
//        System.out.println(x+" "+y+" "+dp[x][y]);
        return;
    }
    public static boolean isValid(int x,int y){
        return x>=0&&x<m&&y>=0&&y<n;
    }
}
