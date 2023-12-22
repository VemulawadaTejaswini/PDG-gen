import java.io.*;
import java.util.*;
class Main  {

    public static void main(String[] args) throws IOException{

        Reader sc=new Reader();
        //System.out.println(-5%10000000);
        PrintWriter out = new PrintWriter(System.out);

        long mod=1000000007;
        int n=sc.nextInt();
        int k=sc.nextInt();

        Long arr[]=new Long[n];
        int tp=0,tn=0;

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
            if(arr[i]>0) tp+=1;
            if(arr[i]<0) tn+=1;
        }
        Arrays.sort(arr, new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {

                long l1=Math.abs(o2)-Math.abs(o1);
                if(l1>0) return 1;
                if(l1<0) return -1;
                return 0;
            }
        });
        if(k==1)
        {
            System.out.println((arr[0]+mod)%mod);
            return;
        }
        long ans=1;
        int i=0;

        int pc=0,nc=0;
        while(i<k-2)
        {
            if(arr[i]<0) nc+=1;
            if(arr[i]>0) pc+=1;
            ans=(ans*arr[i])%mod;

            i+=1;
        }
        if(pc+nc+1>=tp+tn)
        {
            System.out.println(0);
            return;
        }
        if(n==k)
        {
            ans=(ans*arr[n-2])%mod;
            ans=(ans*arr[n-1])%mod;
            ans=(ans+mod)%mod;

        }
        else
        {
            if(ans>0)
            {
                long ans1=ans;
                long ans2=ans;
                if(tp-pc>=2)
                {
                    int c1=0;
                    for(int i1=k-2;i1<n;i1++)
                    {
                        if(c1==2)break;
                        if(arr[i1]>0)
                        {
                            c1+=1;
                            ans1=(ans1*arr[i1])%mod;
                        }
                    }
                }
                if(tn-nc>=2)
                {
                    int c1=0;
                    for(int i1=k-2;i1<n;i1++)
                    {
                        if(c1==2)break;
                        if(arr[i1]<0)
                        {
                            c1+=1;
                            ans2=(ans2*arr[i1])%mod;
                        }
                    }
                }

                else if(tp-pc<=1 && tn-nc<=1)
                {
                    System.out.println(0);
                    return;
                }
                ans=Math.max(ans1,ans2);
            }
            else if(ans<0)
            {
                int c1=0,c2=0;
                if(tp-pc>=1 && tn-nc>=1)
                {
                    for(int i1=k-2;i1<n;i1++)
                    {
                        if(c1>=1 && c2>=1) break;
                        if(c1<1 && arr[i1]<0)
                        {
                            c1+=1;
                            ans=(ans*arr[i1])%mod;
                        }
                        else if(c2<1 && arr[i1]>0)
                        {
                            c2+=1;
                            ans=(ans*arr[i1])%mod;
                        }
                    }
                }
                else
                {
                    for(int kk=0;kk<n;kk++)
                    {
                        if(arr[kk]==0)
                        {
                            System.out.println(0);
                            return;
                        }
                    }
                    //cehck for 0
                    //else mul min

                    long a1=1;
                    long cc=0;
                    for(int a=n-1;a>=0;a--)
                    {
                        if(cc==k) break;
                        a1=(a1*arr[a])%mod;
                        cc+=1;
                    }
                    a1=(a1+mod)%mod;
                    System.out.println(a1);
                    return;
                }

            }
        }
        System.out.println((ans+mod)%mod);

    }


    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String nextLine() throws IOException {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }
        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() throws IOException{
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
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
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
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
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
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

}