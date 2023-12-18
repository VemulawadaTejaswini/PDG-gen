import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by rakshit on 10/2/17.
 * Java is Love , 4 Forces.. :)
 */
public class omp {

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
    public static void main(String args[]) throws IOException
    {
        OutputStream outputstream=System.out;
        Reader in=new Reader();
        PrintWriter out=new PrintWriter (outputstream);
        Task solver=new Task();
        solver.solve(in,out);
        in.close();
    }

    static class Task
    {
        public final int k=123456;
        public final int mod=1000000000;
        public void solve(Reader in , PrintWriter out) throws IOException
        {
            int n,l,r;
            n=in.nextInt();
            l=in.nextInt();
            r=in.nextInt();

            int a[]=new int [n];
            int b[]=new int [n];
            int c[]=new int [n];


            for(int i=0;i<n;i++)
            {
                a[i]=in.nextInt();
                b[i]=in.nextInt();
                c[i]=in.nextInt();
            }

            int Asum=0,Bsum=0,store=0;
            SortedSet<Integer>check=new TreeSet<>();
            for(int i=1;i<=n;i++)
            {
                for(int j=0;j<n-i+1;j++)
                {
                    Asum=sum(a,j,i);
                    Bsum=sum(b,j,i);

                    if(Asum*r==Bsum*l)
                    {
                        store=sum(c,j,i);
                        check.add(store);
                    }
                }
            }

            if(check.size()==0)
            {
                out.println(-1);
            }
            else
            {
                out.println(check.first());
            }

            out.flush();

        }

        public int sum(int a[],int n,int m)
        {
            int sum=0;
            for(int i=n;i<n+m;i++)
            {
                sum+=a[i];
            }

            return sum;
        }

        public static long max(long a,long b)
        {
            if(a>b)
            {
                return a;
            }
            else
            {
                return b;
            }
        }

        private static long gcd(long a,long b)
        {
            if(a==0)
                return b;
            else
                return gcd(b%a,a);
        }

        private static long lcm(long a, long b)
        {
            return (a*b)/gcd(a,b);
        }

        private static boolean prime(int n)
        {
            if(n==1 || (n%2==0 && n!=2))
                return false;
            else if(n==2 || n==3)
            {
                return true;
            }
            else
            {
                int res=0;
                for(int i=3;i<=(int)Math.sqrt(n) ;i+=2)
                {
                    if(n%i==0)
                    {
                        res++;
                        break;
                    }
                }

                if(res>0)
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }
        }
    }
}