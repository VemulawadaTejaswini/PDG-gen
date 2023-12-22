import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Main m = new Main();
		m.input();
		m.solve();
		m.output();
	}
	
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	InputUtil in = new InputUtil();
	PrintWriter out = new PrintWriter(System.out);
	
	int n = 0;
	ArrayGraph<NodeValue> g = new ArrayGraph<>();
	
	public void input() throws IOException {
		n = in.nextInt();
		g.init(n);
		for(int i=0; i<n; i++) {
			int v = in.nextInt();
			int k = in.nextInt();
			int[] adj = in.nextInt(new int[k]);
			g.addVertice(v, adj, 0, k);
		}
	}

	public void solve() throws IOException {
		int t = 0;
		for(int i=1; i<=n; i++) {
			t = dfs(i,t);
		}
	}
	
	public void output() {
		for(int i=1; i<=n; i++) {
			out.print(i);
			out.print(' ');
			out.print(g.getValue(i).d);
			out.print(' ');
			out.println(g.getValue(i).f);
		}
		out.flush();
	}
	
	private int dfs(int nodeId, int timestamp) {
		NodeValue nv = g.getValue(nodeId);
		if(nv == null) {
			nv = new NodeValue();
			nv.d = ++timestamp;
			g.setValue(nodeId,nv);
			for(int adjNodeId: g.getAdjNode(nodeId)){
				timestamp = dfs(adjNodeId,timestamp);
			}
			nv.f = ++timestamp;
		}
		return timestamp;
	}
	
}

class NodeValue {
	int d = 0;
	int f = 0;
}

class ArrayGraph<T> {

	int[][] adj = null;
	List<T> value = null;
	
	public ArrayGraph() {}
	
	public void init(int nodeMax) {
		adj = new int[nodeMax+1][];
		value = new ArrayList<>(nodeMax+1);
		for(int i=0; i<=nodeMax; i++) {
			value.add(null);
		}
	}
	
	public void addVertice (int nodeId, int[] adjNode, int adjNodeoffset, int adjNodeLen) {
		adj[nodeId] = Arrays.copyOfRange(adjNode, adjNodeoffset, adjNodeLen);
	}
	
	public int[] getAdjNode (int nodeId) {
		return (adj == null || adj.length <= nodeId ) ? null : adj[nodeId];
	}
	
	public T getValue(int nodeId) {
		return (value == null || value.size() <= nodeId) ? null : value.get(nodeId);
	}

	public void setValue(int nodeId, T v) {
		value.set(nodeId,v);
	}
}


class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 100000;
	
	//Fields
	protected InputStream in;
	private byte[] buf = null;
	private int ptr = 0;
	private int max = -1;
	private DataInputStream dis = null;
	//Constructors
	public InputUtil() {this(System.in,BUFSIZ);}
	public InputUtil(InputStream in, int bufsiz) {
		initBuf(bufsiz);
		initIn(in);
	}
	
	//Methods
	//Initializer
	protected void initIn(InputStream in) {dis = new DataInputStream(this.in = in);}
	protected void initBuf(int bufsiz) {buf = new byte[bufsiz];}
	
	//buffer operation
	private void next() throws IOException {ptr++; readBuf();}
	private void readBuf() throws IOException {
		if(ptr >= max && dis.available()>0) {
			if(max>0) Arrays.fill(buf,0,max,(byte)0);
			max = dis.read(buf);
			ptr = 0;
		}
	}
	
	//Number Input Reader/Parser
	private boolean isNum(byte b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(byte b) {return b=='-'; }

	private int _nextInt() throws IOException {
		int sign = 1;
		int res = 0;
		byte c;
		while (!isNum(c=buf[ptr]) && !isMinus(c)) 
			next();
		if (isMinus(buf[ptr])) {
			sign = -1;
			next();
		}
		while (isNum(c=buf[ptr])) {
			res *= 10;
			res += c - '0' ;
			next();
		}
		next();
		return sign * res;
	}
	
	public int nextInt() throws IOException {
		readBuf();
		return _nextInt();
	}

	public int[] nextInt(int[] result) throws IOException {
		readBuf();
		for(int i=0; i<result.length; i++) {
			result[i] = _nextInt();
		}
		return result;
	}
	
	//Close 
	public void close() throws IOException {
		if(!this.in.equals(System.in)) 
			this.in.close();
	}

}