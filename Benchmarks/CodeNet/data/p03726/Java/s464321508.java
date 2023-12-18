import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		try{
			new Main().solve();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	void solve() throws IOException{
		ContestScanner in = new ContestScanner();
		int n = in.nextInt();
		HashSet<Integer>[] tree = new HashSet[n];
		int[] into = new int[n];
		for(int i = 0; i < n; i++) {
			tree[i] = new HashSet<>();
		}
		for(int i = 0; i < n - 1 ; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			tree[a].add(b);
			tree[b].add(a);
			into[a]++;
			into[b]++;
		}
		for(int i = 0; i < n; i++) {
			if(into[i] > 1) continue;
			int cnt = 0;
			int pre = -1;
			int v = i;
			while(into[v] == 1) {
				cnt++;
				int nx = next(tree, v, pre);
				if(nx == -1) {
					System.out.println(cnt % 2 == 0 ? "Second" : "First");
					return;
				}
				pre = v;
				tree[v].remove(nx);
				tree[nx].remove(v);
				into[v]--;
				into[nx]--;
				v = nx;
			}
			if(cnt % 2 == 1) {
				into[v]++;
				into[pre]++;
				tree[v].add(pre);
				tree[pre].add(v);
			}
		}
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(into[i] > 2) {
				System.out.println("First");
				return;
			}
			cnt++;
		}
		System.out.println(cnt % 2 == 0 ? "Second" : "First");
		in.close();
	}
	
	int next(HashSet<Integer>[] tree, int v, int pre) {
		for(int nv: tree[v]) {
			if(nv != pre) return nv;
		}
		return -1;
	}
}

class ContestScanner implements Closeable{
	private BufferedReader in;private int c=-2;
	public ContestScanner()throws IOException 
	{in=new BufferedReader(new InputStreamReader(System.in));}
	public ContestScanner(String filename)throws IOException
	{in=new BufferedReader(new InputStreamReader(new FileInputStream(filename)));}
	public String nextToken()throws IOException {
		StringBuilder sb=new StringBuilder();
		while((c=in.read())!=-1&&Character.isWhitespace(c));
		while(c!=-1&&!Character.isWhitespace(c)){sb.append((char)c);c=in.read();}
		return sb.toString();
	}
	public String readLine()throws IOException{
		StringBuilder sb=new StringBuilder();if(c==-2)c=in.read();
		while(c!=-1&&c!='\n'&&c!='\r'){sb.append((char)c);c=in.read();}
		return sb.toString();
	}
	public long nextLong()throws IOException,NumberFormatException
	{return Long.parseLong(nextToken());}
	public int nextInt()throws NumberFormatException,IOException
	{return(int)nextLong();}
	public double nextDouble()throws NumberFormatException,IOException 
	{return Double.parseDouble(nextToken());}
	public void close() throws IOException {in.close();}
}