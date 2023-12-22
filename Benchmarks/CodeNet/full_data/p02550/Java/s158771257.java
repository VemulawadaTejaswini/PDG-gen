import java.util.*;
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

    static class Print
    {
        private final BufferedWriter bw;
        public Print()
        {
            bw=new BufferedWriter(new OutputStreamWriter(System.out));
        }
        public void print(String str)throws IOException
        {
            bw.append(str);
        }
        public void printLine(String str)throws IOException
        {
            print(str);
            bw.append("\n");
        }
        public void close()throws IOException
        {
            bw.close();
        }
    }

	public static void main(String[] args) throws IOException {
		Reader sc=new Reader();
		Print pr=new Print();
		long n=sc.nextLong();
		long x=sc.nextLong();
		long m=sc.nextLong();
		ArrayList<Long> arr=new ArrayList<Long>();
		HashSet<Long> set=new HashSet<Long>();
		long ans=x;
		long prev=x;
		int i;
		for(i=2;i<=n;i++) {
			arr.add(prev);
			set.add(prev);
			prev=(prev*prev)%m;
			if(set.contains(prev)) {
				break;
			}
			ans+=prev;
		}
		if(i<n) {
			long sum=0;
			long sum1=0;
			long rem=(n-i+1)%(arr.size()-arr.indexOf(prev));
			for(int j=arr.indexOf(prev);j<arr.size();j++) {
				if(rem>0) 
					sum1+=arr.get(j);
				sum+=arr.get(j);
				rem--;
			}
			ans+=sum*((n-i+1)/(arr.size()-arr.indexOf(prev)))+sum1;
		}
		pr.printLine(ans+"");
		pr.close();
	}
}