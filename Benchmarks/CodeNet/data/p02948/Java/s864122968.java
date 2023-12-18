import java.util.*;
import java.io.*;
public class Main{
	public static void main(String sp[])throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<pair> al = new ArrayList<>();
		for(int i=0;i<n;i++){
			pair p = new pair();
			int day = sc.nextInt();
			int cost = sc.nextInt();
			if(day<=m){
				p.cost=cost;
				p.day=day;
			}
			al.add(p);
		}
		
		Collections.sort(al, new comp());
		Collections.sort(al, new comp1());
		
		long total=0;
		int count=0;
		for(int i=0;i<al.size();i++){
			pair p = al.get(i);
			int val = p.day+count;
			if(val<=m){
				total+=p.cost;
				count++;
			}
		}
		System.out.println(total);
	}
	
	public static class pair{
		int cost;
		int day;
	}
	
	public static class comp implements Comparator<pair>{
		public int compare(pair o1, pair o2){
			return o2.day-o1.day;
		}
	}
	
	public static class comp1 implements Comparator<pair>{
		public int compare(pair o1, pair o2){
			return o2.cost-o1.cost;
		}
	}
	
	static class Reader
		{
			final private int BUFFER_SIZE = 1 << 16;
			private DataInputStream din;
			private byte[] buffer;
			private int bufferPointer, bytesRead;
			BufferedReader br;
			public Reader()
			{
				din = new DataInputStream(System.in);
				buffer = new byte[BUFFER_SIZE];
				bufferPointer = bytesRead = 0;
				br = new BufferedReader(new InputStreamReader(System.in));
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
				} while ((c = read()) >= '0' && c <= '9');
	 
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
				do
				{
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
			StringTokenizer st;
			String next() {
				while (st == null || !st.hasMoreTokens()) {
					try {
						st = new StringTokenizer(br.readLine());
					} catch (Exception r) {
						r.printStackTrace();
					}
				}
				return st.nextToken();
			}
	 
	 
			public void close() throws IOException
			{
				if (din == null)
					return;
				din.close();
			}
		}
}