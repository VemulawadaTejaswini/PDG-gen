import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n  = Integer.parseInt(br.readLine());
        Node[] nodes = new Node[n];
        makeNodeinfo(br,nodes,n);

        int i = 0;
        while(nodes[i].parent != -1 ){
        	i++;
        }
        recDepth(nodes,i,0);

        disp(nodes,n);
	}

	public static void disp(Node[] nodes,int n){
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < n ; i++ ){
			sb.append("node ");
			sb.append(String.valueOf(i));
			sb.append(": ");
			sb.append("parent = ");
			sb.append(String.valueOf(nodes[i].parent));
			sb.append(", ");
			sb.append("depth = ");
			sb.append(String.valueOf(nodes[i].depth));
			sb.append(", ");
			if(nodes[i].parent == -1){
				sb.append("root,");
			}else if(nodes[i].left == -1 ){
				sb.append("leaf,");
			}else{
				sb.append("internal node,");
			}

			if(nodes[i].left != -1){
				sb.append(" [");
				dispChild(nodes,nodes[i].left,sb);
				sb.append("]");
			}else{
				sb.append(" []");
			}

			sb.append("\n");
		}

		sb.delete(sb.length() - 1, sb.length());
		System.out.println(sb.toString());
	}

	public static void dispChild(Node[] nodes,int left,StringBuilder sb){
			int currentChild = left;
			while(currentChild != -1){
				sb.append(String.valueOf(currentChild));
				sb.append(" ,");
				currentChild = nodes[currentChild].right;
			}
			sb.delete(sb.length() - 2,sb.length());
	}

	public static void recDepth(Node[] nodes,int i,int depth){
		nodes[i].depth = depth;
		if(nodes[i].left != -1) recDepth(nodes,nodes[i].left,depth + 1);
		if(nodes[i].right != -1) recDepth(nodes,nodes[i].right,depth);
	}

	public static void makeNodeinfo(BufferedReader br,Node[] nodes,int n) throws Exception{
		Node node;
		for(int i = 0 ; i < n ; i++){
			nodes[i] = new Node();
		}
		String[] strs;
		for(int i = 0 ; i < n ; i++ ){
			strs = br.readLine().split(" ");
			int x = Integer.parseInt(strs[1]);
			int current = -1;
			int pre = -1;
			for(int j = 0 ; j < x ; j++){
				current = Integer.parseInt(strs[j + 2]);

				if(j == 0){ //??????????????????
					 nodes[i].left = current;
					 nodes[current].parent = i;
					 pre = current;
				}else{  //????????????
					nodes[pre].right = current;
					nodes[current].parent = i;
					pre = current;
				}
			}
		}
	}

}
 class Node {

	 Node(){
		 this.parent = -1;
		 this.left = -1;
		 this.right = -1;
		 this.depth = -1;
	 }

	 int parent;
	 int left;
	 int right;
	 int depth;
 }