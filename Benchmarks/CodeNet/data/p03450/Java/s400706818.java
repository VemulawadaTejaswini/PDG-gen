import java.util.*;
import java.io.*;
class Main
{
	static int noofnodes , noofqueries;
	static int[] arr = new int[100100];
	static Stack<Integer>[] lstk,rstk ;
	// static Stack<Integer> queries ;  
	static HashMap<String,Long> hmap = new HashMap<>();
	static int[] visit ,newvisit;
	static int flag =0 , currval=0 , chkflag =0 ;
	static Queue<Integer> queries = new LinkedList<>();
	static long sum =0 ,count =0 ;
	static Reader s=new Reader();

	public static void dfs(int value) throws IOException
	{
		abc:while(!lstk[value].isEmpty())
		{
			int poped = lstk[value].pop();
			// System.out.println("Stack value = "+value);
			// System.out.println("poped  value = "+poped);
			

			// if(visit[poped]==0)
			{
				sum+=hmap.get(value+" "+poped);
				// System.out.println("sum inside condition = "+sum);
				// System.out.println("visit value of poped element  = "+visit[poped]);
				// System.out.println("visit value of stack number = "+visit[value]);
				// count++;
				dfs(poped);
			}

			// System.out.println("poped = "+poped+" sum = "+sum +" Stack value = "+value );
			
			// System.out.println("currval = "+currval);
			// if(visit[value] == 0)
			if(hmap.containsKey(currval+" "+poped))
			{
				if(hmap.get(currval+" "+poped)!=sum)
				{
					chkflag = 1;
					break abc;
				}
			}
			else
			{
				hmap.put((currval+" "+poped),sum);
				hmap.put((poped+" "+currval),-sum);
			}

			// System.out.println("before sum =  "+sum);
			sum -=hmap.get(value+" "+poped) ;
			visit[poped]=1;
			// System.out.println("visit value of poped element  = "+visit[poped]);
			// System.out.println();
			// System.out.println();
		}		
		
		visit[value]=1;
		// sum =0 ;

	}


	public static void main(String[] args) throws IOException
	{
		// Scanner s= new Scanner(System.in);
		noofnodes = s.nextInt();
		noofqueries = s.nextInt();
		visit = new int[noofnodes+1];

		lstk = new Stack[noofnodes+1];
		rstk = new Stack[noofnodes+1];
		// queries = new Stack<Integer>();
		for(int i =0;i<noofnodes+1;i++ )
		{
			lstk[i] = new Stack<Integer>();
			rstk[i] = new Stack<Integer>();
		}

		//storing 
		for(int i=0;i<noofqueries;i++)
		{
			int l = s.nextInt();	
			int r = s.nextInt();
			long d = s.nextLong();
			lstk[l].push(r);
			rstk[r].push(l);
			if(arr[l] == 0)
				queries.add(l);
			arr[l] = 1;

			String line1 = l+" "+r;
			String line2 = r+" "+l;
			
			hmap.put(l+" "+r,d);
			hmap.put(r+" "+l,-d);

		}

		
			while(!queries.isEmpty())
			{
				int ele = queries.remove();
				sum=0;
				currval = ele;
				newvisit = new int[noofnodes+1];
				
				// System.out.println("came from here "+ele);
				
				if(visit[ele] == 0)
				dfs(ele);			
				// visit[ele]=1;

				if(chkflag != 0)	
				{
					break;
					// System.out.println("time to take break ");
				}
			}
			// System.out.println(count);
			if(chkflag == 0)
				System.out.println("Yes");
			else
				System.out.println("No");

	}

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


}