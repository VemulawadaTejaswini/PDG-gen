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

	private static class Node {
		int rs;
		int cs;
		int re;
		int ce;
		Node right=null;
		Node left=null;

		public Node(int rs, int cs, int re,int ce) {
			this.rs=rs;
			this.cs=cs;
			this.re=re;
			this.ce=ce;
		}
	}

	static long find(Node t,int x,int y) {
        if(t.left==null&&t.right==null) {
        	if(x==1) {
        		t.left=new Node(t.rs,t.cs,t.re,y);
        		t.right=new Node(t.rs,y+1,t.re,t.ce);
        		return t.re-t.rs-1;
        	}
        	else if(y==1) {
        		t.left=new Node(x+1,t.cs,t.re,t.ce);
        		t.right=new Node(t.rs,t.cs,x,t.ce);
        		return t.ce-t.cs-1;
        	}
        }
        if(t.left.rs<=x&&t.left.re>x&&t.left.cs<=y&&t.left.ce>y) {
        	return find(t.left,x,y);
        }
        else if(t.right.rs<=x&&t.right.re>x&&t.right.cs<=y&&t.right.ce>y) {
        	return find(t.right,x,y);
        }
        else {
        	return 0;
        }
    }

	public static void main(String[] args) throws IOException {
		Reader sc=new Reader();
		Print pr=new Print();
		int n=sc.nextInt();
		int q=sc.nextInt();
		Node tree=new Node(1,1,n,n);
		long ans=0;
		boolean row[]=new boolean[n];
		boolean col[]=new boolean[n];
		while(q-->0) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(x==1&&!col[y]) {
				long xx=find(tree,x==1?x:y,x==1?y:1);
				ans+=xx;
				col[y]=true;
			}
			if(x==2&&!row[y]) {
				long xx=find(tree,x==1?x:y,x==1?y:1);
				ans+=xx;
				row[y]=true;
			}
		}
		pr.printLine(""+(((long)(n-2)*(n-2))-ans));
		pr.close();
	}
}