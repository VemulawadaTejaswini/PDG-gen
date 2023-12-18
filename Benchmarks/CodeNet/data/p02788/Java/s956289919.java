import java.io.*;
import java.util.*;
public class Main {
	static class pair implements Comparable<pair>{
		long x,h;
		pair(long xx,long hh){x=xx;h=hh;}
		@Override
		public int compareTo(pair o) {
			return Long.compare(x,o.x);
		}
		
	}
	public static void main(String[] args) throws Exception {
		MScanner sc=new MScanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int n=sc.nextInt(),d=sc.nextInt(),a=sc.nextInt();
		pair[]in=new pair[n];
		for(int i=0;i<n;i++) {
			in[i]=new pair(sc.nextLong(), sc.nextLong());
		}
		Arrays.sort(in);
		int i=0;
		PriorityQueue<Long>pq=new PriorityQueue<Long>();
		TreeSet<Long>xs=new TreeSet<Long>();
		HashMap<Long, Long>map=new HashMap<Long, Long>();
		
		long range=in[0].x+2l*d;
		long tot=0;
		long ans=0;
		while(i<n) {
			long damage=0;
			long nxtrange=-1;
			while(i<n && in[i].x<=range) {
				xs.add(in[i].x);
				pq.add(in[i].h+tot);
				map.put(in[i].x, in[i].h+tot);
				i++;
			}
			if(i!=n) {
				nxtrange=in[i].x-2l*d;
			}
			while(!xs.isEmpty() && (nxtrange==-1 || xs.first()<nxtrange)) {
				damage=Math.max(damage, (map.get(xs.first())-tot+a-1)/a);
				xs.pollFirst();
			}
			ans+=damage;
			tot+=damage*a;
			while(!pq.isEmpty() && pq.peek()<=tot) {
				pq.poll();
			}
			range=nxtrange+2l*d;
		}
		pw.println(ans);
		pw.flush();
	}
	static class MScanner {
		StringTokenizer st;
		BufferedReader br;
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int[] takearr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] takearrl(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public Integer[] takearrobj(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] takearrlobj(int n) throws IOException {
	        Long[]in=new Long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}
