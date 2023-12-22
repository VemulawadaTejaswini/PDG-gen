
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	@SuppressWarnings("unchecked")
	void solver() {
		while(true){
			int n=ni();
			int a=ni();
			int sv=ni();
			int gv=ni();
			if(n==0&&a==0&&sv==0&&gv==0)
				break;
			int[] src=new int[a];
			int[] dst=new int[a];
			String[] label=new String[a];
			int[] cnt=new int[a+1];
			for(int i=0;i<a;i++){
				src[i]=ni();
				dst[i]=ni();
				label[i]=ns();
				cnt[i+1]+=label[i].length()-1+cnt[i];
			}
			
			ArrayList<Edge>[] g=new ArrayList[n+cnt[a]];
			ArrayList<Edge>[] rev=new ArrayList[n+cnt[a]];
			for(int i=0;i<n+cnt[a];i++){
				g[i]=new ArrayList<>();
				rev[i]=new ArrayList<>();
			}
			
			for(int i=0;i<a;i++){
				for(int j=0;j<label[i].length();j++){
					int s=(j==0?src[i]:n+cnt[i]+j-1);
					int d=(j==label[i].length()-1?dst[i]:n+cnt[i]+j);
					g[s].add(new Edge(s,d,label[i].charAt(j)));
					rev[d].add(new Edge(d,s,label[i].charAt(j)));
				}
			}
			
			boolean[] reachable=new boolean[n+cnt[a]];
			ArrayDeque<Integer> que=new ArrayDeque<>();
			que.add(gv);
			while(!que.isEmpty()){
				int v=que.poll();
				reachable[v]=true;
				for(Edge e:rev[v]){
					if(!reachable[e.dst]){
						reachable[e.dst]=true;
						que.add(e.dst);
					}
				}
			}
			
			if(!reachable[sv]){
				out.println("NO");
				continue;
			}
			
			String ans="";
			ArrayDeque<Integer>[] lis=new ArrayDeque[n+cnt[a]+2];
			for(int i=0;i<n+cnt[a]+2;i++)lis[i]=new ArrayDeque<>();
			lis[0].add(sv);
			out:for(int i=0;i<n+cnt[a]+2;i++){
				if(i==n+cnt[a]+1&&!lis[n+1].isEmpty()){
					ans="NO";
					break out;
				}
				char min='{';
				while(!lis[i].isEmpty()){
					int v=lis[i].poll();
					if(v==gv)break out;
					for(Edge e:g[v]){
						if(min>e.c&&reachable[e.dst]){
							min=e.c;
							lis[i+1].clear();
							lis[i+1].add(e.dst);
						}else if(min==e.c&&reachable[e.dst]){
							lis[i+1].add(e.dst);
						}
					}
				}
				ans+=min;
			}
			out.println(ans);
		}
	}
	
	class Edge{
		int src;
		int dst;
		char c;
		public Edge(int src,int dst,char c) {
			this.src=src;
			this.dst=dst;
			this.c=c;
		}
	}

	void run() {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		solver();
		out.flush();

	}

	static long nl() {
		try {
			long num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	static char nc() {
		try {
			int b = skip();
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

	static double nd() {
		try {
			return Double.parseDouble(ns());
		} catch (Exception e) {
		}
		return 0;
	}

	static String ns() {
		try {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			if (b == -1)
				return "";
			sb.append((char) b);
			while (true) {
				b = is.read();
				if (b == -1)
					return sb.toString();
				if (b <= ' ')
					return sb.toString();
				sb.append((char) b);
			}
		} catch (IOException e) {
		}
		return "";
	}

	public static char[] ns(int n) {
		char[] buf = new char[n];
		try {
			int b = skip(), p = 0;
			if (b == -1)
				return null;
			buf[p++] = (char) b;
			while (p < n) {
				b = is.read();
				if (b == -1 || b <= ' ')
					break;
				buf[p++] = (char) b;
			}
			return Arrays.copyOf(buf, p);
		} catch (IOException e) {
		}
		return null;
	}

	public static byte[] nse(int n) {
		byte[] buf = new byte[n];
		try {
			int b = skip();
			if (b == -1)
				return null;
			is.read(buf);
			return buf;
		} catch (IOException e) {
		}
		return null;
	}

	static int skip() throws IOException {
		int b;
		while ((b = is.read()) != -1 && !(b >= 33 && b <= 126))
			;
		return b;
	}

	static boolean eof() {
		try {
			is.mark(1000);
			int b = skip();
			is.reset();
			return b == -1;
		} catch (IOException e) {
			return true;
		}
	}

	static int ni() {
		try {
			int num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}