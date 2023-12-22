import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		new Main().exec();
	}

	public void exec() throws IOException {
		InputUtil in = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt();
		BinarySearchTree bst = new BinarySearchTree(n);
		for(int i=0; i<n; i++) {
			String cmd = in.br.readLine();
			if(cmd.charAt(0) == 'i'){
				bst.insert(Integer.parseInt(cmd.substring(7)));
			}else if(cmd.charAt(0) == 'f'){
				out.println( (bst.find(Integer.parseInt(cmd.substring(5))) != -1) ? "yes" : "no" );
			}else if(cmd.charAt(0) == 'd'){
				bst.delete(Integer.parseInt(cmd.substring(7)));
			}else{
				out.print(' ');
				output(out, bst.getNodeIdListInOrder(), bst.size());
				out.print(' ');
				output(out, bst.getNodeIdListPreOrder(), bst.size());
			}
		}
//		out.println();
		out.flush();
	}

	
	public void output(PrintWriter out, int[] a, int len) {
		int off = 0;
		out.print(a[off]);
		for(int i=off+1; i<len; i++){
			out.print(' ');
			out.print(a[i]);
		}
		out.println("");
		out.flush();
	}
	
	
}

class BinarySearchTree {

	protected int[] left = null;
	protected int[] right = null;
	protected int[] parent = null;
	protected int maxNodes = 0;
	protected int[] values = null;
	protected int[] nodeBuf = null;
	
	protected int nodePtr = 0;
	protected ArrayDeque<Integer> deletedNodeId = new ArrayDeque<>();
	
	public BinarySearchTree(int maxNodes) {

		this.maxNodes=maxNodes;
		
		left = new int[maxNodes];
		right = new int[maxNodes];
		parent = new int[maxNodes];
		values = new int[maxNodes];
		nodeBuf = new int[maxNodes];
		
		Arrays.fill(left, -1);
		Arrays.fill(right, -1);
		Arrays.fill(parent, -1);
		Arrays.fill(values, -1);
		Arrays.fill(nodeBuf, -1);
	}
	
	public int size() {
		return nodePtr - deletedNodeId.size();
	}

	public int getRootId() {
		int rootId = 0;
		while(parent[rootId] != -1)
			rootId = parent[rootId];
		return rootId;
	}
	
	public void setNodeValue(int id, int value) {
		if(id<maxNodes) values[id] = value;
	}
	
	protected int getNewNodeId() {
		if(nodePtr==0)
			return nodePtr++;
		if(deletedNodeId.isEmpty()){
			return (nodePtr<maxNodes) ? nodePtr++ : -1;
		}
		return deletedNodeId.pop();
	}

	public void setLeftNodeChild(int id, int value) {
		left[id] =  getNewNodeId();
		if(left[id] != -1) {
			parent[left[id]] = id;
		}
		values[left[id]] = value;
	}

	public void setRightNodeChild(int id, int value) {
		right[id] =  getNewNodeId();
		if(right[id] != -1) {
			parent[right[id]] = id;
		}
		values[right[id]] = value;
	}
	
	public void insert(int value) {
		if(nodePtr == 0){
			setNodeValue(getNewNodeId(),value);
		}else{
			int curId = getRootId();
			int curParId = -1;
			while (curId != -1) {
				curParId = curId;
				if(value < values[curId]){
					curId = left[curId];
				}else{
					curId = right[curId];
				}
			}
			if (value < values[curParId]){
				setLeftNodeChild(curParId,value);
			} else {
				setRightNodeChild(curParId,value);
			}
		}
	}
	
	public int find(int value) {
		if(nodePtr == 0){
			return -1;
		}else{
			int curId = getRootId();
			while (curId != -1 && values[curId] != value) {
				if(value < values[curId]){
					curId = left[curId];
				}else{
					curId = right[curId];
				}
			}
			return (curId != -1 && values[curId] == value) ? curId : -1;
		}
	}
	
	public void delete(int value){
		int id = find(value);
		if(id != -1){
			if(left[id]==-1){
				if(right[id]==-1){
					if(parent[id]==-1){
					}else if(left[parent[id]]==id){
						left[parent[id]]=-1;
					}else{
						right[parent[id]]=-1;
					}
				}else{
					if(parent[id]==-1){
						values[id]=values[right[id]];
						left[id]=left[right[id]];
						right[id]=right[right[id]];
						id = right[id];
					}else{
						parent[right[id]]=parent[id];
						if(left[parent[id]]==id){
							left[parent[id]]=right[id];
						}else{
							right[parent[id]]=right[id];
						}
					}
				}
			}else{
				if(right[id]==-1){
					if(parent[id]==-1){
						values[id]=values[left[id]];
						left[id]=left[left[id]];
						right[id]=right[left[id]];
						id = left[id];
					}else{
						parent[left[id]]=parent[id];
						if(left[parent[id]]==id){
							left[parent[id]]=left[id];
						}else{
							right[parent[id]]=left[id];
						}
					}
				}else{
					int nextid=getNextLargerNode(id);
					int nextval = values[nextid]; 
					delete(nextval);
					values[id] = nextval;
					return;
				}
			}
			deleteNodeBuf(id);
		}
	}
	
	private void deleteNodeBuf(int id) {
		if(id+1==nodePtr){
			nodePtr--;
		}else{
			deletedNodeId.add(id);
			left[id]=-1;
			right[id]=-1;
		}
	}
	
	public int[] getNodeIdListPreOrder() {
		preOrder(0,getRootId());
		return nodeBuf;
	}
	
	protected int preOrder(int nodePtr, int id) {
		if(id == -1) return nodePtr;
		nodeBuf[nodePtr++] = values[id];
		nodePtr = preOrder(nodePtr,left[id]);
		nodePtr = preOrder(nodePtr,right[id]);
		return nodePtr;
	}
	
	public int[] getNodeIdListInOrder() {
		inOrder(0,getRootId());
		return nodeBuf;
	}
	
	protected int inOrder(int nodePtr, int id) {
		if(id == -1) return nodePtr;
		nodePtr = inOrder(nodePtr,left[id]);
		nodeBuf[nodePtr++] = values[id];
		nodePtr = inOrder(nodePtr,right[id]);
		return nodePtr;
	}
	
	public int getNextLargerNode(int id) {
		if(id < 0 || maxNodes <= id)
			return -1;
		return getMinChildNode(right[id]);
	}
	
	public int getMinChildNode(int rootId) {
		if(rootId < 0 || maxNodes <= rootId) 
			return -1;
		if(left[rootId] == -1) 
			return rootId;
		return getMinChildNode(left[rootId]);
	}
	
}

class InputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String[] readStrArray(String delim) throws NumberFormatException, IOException{
    	return br.readLine().split(delim);
    }
    
    public int nextInt() throws NumberFormatException, IOException{
    	return Integer.parseInt(br.readLine());
    }
    
    public int[] nextInt(int[] a, int num) throws NumberFormatException, IOException{
        int i=0;
        while(i<num) {
            for(String s: br.readLine().split(" ")){
            	if(i<num) {
                    a[i++] = Integer.parseInt(s);
            	}
            }
        }
        return a;
    }
}