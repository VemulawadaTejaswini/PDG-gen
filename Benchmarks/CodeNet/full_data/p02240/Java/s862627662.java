import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


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
	int m = 0;
	Graph<Integer> g = new Graph<Integer>(){
		@Override
		public Integer getInitValueInstance() {
			return -1;
		}
		
	};
	int q = 0;
	int[] s = null;
	int[] t = null;
	boolean[] ans = null;
	int nextGroupId = 0;
	
	public void input() throws IOException {
		n = in.nextInt();
		m = in.nextInt();
		g.init(n);
		for(int i=0; i<m; i++) {
			g.addDualAdjInfo(in.nextInt(),in.nextInt());
		}
		
		q = in.nextInt();
		s = new int[q];
		t = new int[q];
		ans = new boolean[q];
		for(int i=0; i<q; i++) {
			s[i] = in.nextInt();
			t[i] = in.nextInt();
		}
		
	}

	public void solve() throws IOException {
		for(int i=0; i<q; i++) {
			ans[i] = solveSub(s[i],t[i]);
		}
	}
	
	private boolean solveSub(int fromId, int toId) {
		int fromGroupId = g.getValue(fromId); 
		
		if(fromGroupId == -1) {
			fromGroupId = nextGroupId++;
			g.setValue(fromId, fromGroupId);
			ArrayDeque<Integer> q = new ArrayDeque<>();
			q.add(fromId);
			
			while(!q.isEmpty()) {
				int id = q.pop();
				int groupid = g.getValue(id);
				for(int adjid : g.getAdjNode(id)) {
					if(g.getValue(adjid) == -1){
						g.setValue(adjid, groupid);
						q.add(adjid);
					}
				}
			}
		}
		return fromGroupId == g.getValue(toId);
	}
	
	public void output() {
		for(int i=0; i<q; i++) {
			out.println(ans[i] ? "yes" : "no");
		}
		out.flush();
	}
}


abstract class Graph<T> {

	ArrayList<HashSet<Integer>> adj = null;
	List<T> value = null;
	
	public Graph() {}
	
	public abstract T getInitValueInstance() ;
	
	public void init(int nodeMax) {
		adj = new ArrayList<>(nodeMax+1);
		value = new ArrayList<>(nodeMax+1);
		for(int i=0; i<=nodeMax; i++){
			adj.add(i,new HashSet<>());
			value.add(i,getInitValueInstance());
		}
	}

	public void addAdjInfo (int nodeId, int adjNodeId) {
		adj.get(nodeId).add(adjNodeId);
	}
	
	public void addDualAdjInfo (int nodeId, int adjNodeId) {
		adj.get(nodeId).add(adjNodeId);
		adj.get(adjNodeId).add(nodeId);
	}
	
	public Set<Integer> getAdjNode (int nodeId) {
		return adj.get(nodeId);
	}
	
	public T getValue(int nodeId) {
		return value.get(nodeId);
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