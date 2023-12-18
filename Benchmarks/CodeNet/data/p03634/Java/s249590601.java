import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
	public static long l=0,l2=0;
	public static void main(String[] args) throws IOException {
		l = System.currentTimeMillis();
		new Main().exec();
		l2 = System.currentTimeMillis();
		
	}
	
	long[] KDistance = null;
	
	public void exec() throws IOException {
		InputUtil in = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);
		int N = in.nextInt();
		NodeManager nm = new NodeManager (N);
		for(int i=1; i<N; i++) {
			int a=in.nextInt();
			int b=in.nextInt();
			int c=in.nextInt();
			nm.getNode(a).distance.put(b,c);
			nm.getNode(b).distance.put(a,c);
		}
		int Q = in.nextInt();
		int K = in.nextInt();
		outputQ(nm,K,Q,in,out);
		out.flush();
	}
	
	private void calcKDistance(NodeManager nm, int K){
		KDistance = new long[nm.N+1];
		KDistance[K] = 0;
		ArrayDeque<Integer> nextNodeId = new ArrayDeque<>();
		nextNodeId.add(K);
		while(!nextNodeId.isEmpty()) {
			int fromNodeId = nextNodeId.pop();
			for(int toNodeId :nm.nodeArray[fromNodeId].distance.keySet()) {
				if(toNodeId==K || KDistance[toNodeId] > 0) 
					continue;
				KDistance[toNodeId] = KDistance[fromNodeId] + nm.nodeArray[fromNodeId].distance.get(toNodeId);
				nextNodeId.add(toNodeId);
			}
		}
	}
	
	private void outputQ(NodeManager nm, int K, int Q, InputUtil in,PrintWriter out) throws IOException{
		calcKDistance(nm,K);
		for(int i=0; i<Q; i++){
			int x = in.nextInt();
			int y = in.nextInt();
			out.println(KDistance[x]+KDistance[y]);
		}
	}
}

class NodeManager {
	Node[] nodeArray = null;
	int N;
	public NodeManager (int N){
		this.N = N;
		nodeArray = new Node[N+1];
	}
	
	public Node getNode(int id) {
		Node node = null;
		if(nodeArray[id] == null) {
			node = new Node(id,this);
		} else 
			node = nodeArray[id];
		return node;
	}
	
	public Node addNode(int id, Node node) {
		return nodeArray[id] = node;
	}
	

}



class Node {
	int nodeId = 0;
	HashMap<Integer,Integer> distance = new HashMap<>();
	
	public Node(int id, NodeManager nm) {
		nodeId = id;
		nm.addNode(id,this);
	}
	
}



class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 100000;
	
	//Fields
	protected InputStream in;
	private char[] buf = null;
	private int ptr = 0;
	private int max = -1;
	private BufferedReader br = null;
	
	//Constructors
	public InputUtil() {this(System.in,BUFSIZ);}
	public InputUtil(InputStream in, int bufsiz) {
		initBuf(bufsiz);
		initIn(in);
	}
	
	//Methods
	//Initializer
	protected void initIn(InputStream in) {br = new BufferedReader(new InputStreamReader(this.in = in));}
	protected void initBuf(int bufsiz) {buf = new char[bufsiz];}
	
	//buffer operation
	private void next() throws IOException {ptr++; readBuf();}
	private void readBuf() throws IOException {
		if(ptr >= max && br.ready()) {
			if(max>0) Arrays.fill(buf,0,max,(char)0);
			max = br.read(buf);
			ptr = 0;
		}
	}
	
	//Number Input Reader/Parser
	private boolean isNum(char b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(char b) {return b=='-'; }

	private int _nextInt() throws IOException {
		int sign = 1;
		int res = 0;
		char c;
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