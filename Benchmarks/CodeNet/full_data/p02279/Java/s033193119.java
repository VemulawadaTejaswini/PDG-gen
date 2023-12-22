import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
	
	public static void main(String[] args) throws IOException {
		new Main().exec();
	}
	
	public void exec() throws IOException {
		InputUtil in = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt();
		RootedTree tree = new RootedTree(n);
		for(int i=0; i<n; i++){
			int parentId = in.nextInt();
			int childNum = in.nextInt();
			for(int j=0; j<childNum; j++) {
				int childId = in.nextInt();
				tree.createEdge(parentId, childId);
			}
		}
		tree.initDepth();
		out.print(tree.toString());
		out.flush();
	}
}

class RootedTree {
	
	private Node[] nodes = null;
	
	public RootedTree(int maxNodes) {
		nodes = new Node[maxNodes];
		for(int i=0; i<maxNodes; i++) {
			createNode(i);
		}
	}
	
	public Node createNode(int nodeId){
		return nodes[nodeId] = new Node(this,nodeId);
	}

	public void createEdge(int parentId, int childId){
		nodes[childId].addParent(parentId);
	}
	
	public void initDepth() {
		int rootId = -1;
		for(int i=0; i<nodes.length; i++) {
			if(nodes[i].parent == null) {
				if(rootId != -1){
					throw new IllegalStateException();
				}
				rootId = i;
			}
		}
		nodes[rootId].depth = 0;
		ArrayDeque<Node> q = new ArrayDeque<>();
		q.add(nodes[rootId]);
		while(!q.isEmpty()) {
			Node parent = q.pop();
			int parentDepth = parent.depth; 
			for (Node child : parent.children) {
				child.depth = parentDepth + 1;
				q.add(child);
			}
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<nodes.length; i++) {
			nodes[i].appendStringBuilder(sb);
		}
		return sb.toString();
	}
	
	public class Node {
		RootedTree tree = null;
		int id = -1;
		int depth = 0;
		Node parent = null;
		List<Node> children = new ArrayList<>();
		
		private Node(RootedTree tree, int id) {
			this.tree=tree;
			this.id=id;
		}
		
		private void addParent(int id){
			parent=tree.nodes[id];
			parent.children.add(this);
		}
		
		private String getTypeString() {
			if(parent == null)
				return "root";
			else if (children.size()==0)
				return "leaf";
			return "internal node";
		}
		
		public String toString() {
			return appendStringBuilder(new StringBuilder()).toString();
		}
		
		public StringBuilder appendStringBuilder(StringBuilder sb) {
			sb.append(String.format("node %d: parent = %d, depth = %d, %s, [", id, (parent==null)?-1:parent.id, depth, getTypeString()));
			for(int i=0; i<children.size(); i++) {
				if(i>0)
					sb.append(", ");
				sb.append(children.get(i).id);
			}
			sb.append("]\n");
			return sb;
		}
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