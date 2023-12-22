import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int debugCount = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nodeNum  = Integer.parseInt(br.readLine());
		Node[] nodes = makeNodes(nodeNum,br);
		setDepth(getParentIndex(nodes),0,nodes);
		printNodeInfo(nodes,nodeNum);
	}

	public static Node[] makeNodes(int nodeNum, BufferedReader br) throws IOException{
		Node[] nodes = new Node[nodeNum];
		for(int i = 0; i < nodeNum ; i++) nodes[i] = new Node();

		int childrenNum = -1;
		int leftbrother = -1;
		int id = -1;

		//????????????????????±????¨??????\????????????????????????????????§??????????¨??????????
		for(int i = 0; i < nodeNum ; i++){
			String[] info = br.readLine().split(" ");

			//id?????????
			id = Integer.parseInt(info[0]);
			//???????????°
			childrenNum = Integer.parseInt(info[1]);
			//??????????????±????¨????
			for(int y = 0 ; y < childrenNum ; y++){
				if(y == 0){ //????????????????????????left????¨????
					nodes[id].left = leftbrother = Integer.parseInt(info[2]);
					//??????????????????id????¨????
					nodes[leftbrother].parent = id;
				}else{ //???????????????????????????????????????right????¨????
					nodes[leftbrother].right = Integer.parseInt(info[2+y]);
					leftbrother = Integer.parseInt(info[2+y]);
					//??????????????????id????¨????
					nodes[leftbrother].parent = id;
				}
			}
		}

		return nodes;
	}


	public static void setDepth(int nodeIndex ,int depth,Node[] nodes){

		nodes[nodeIndex].depth = depth;

		try{
			if(nodes[nodeIndex].right != -1){
				debugCount++;
				setDepth(nodes[nodeIndex].right,depth,nodes);
			}
		}catch (StackOverflowError e) {

		}


		if(nodes[nodeIndex].left != -1){
			setDepth(nodes[nodeIndex].left,depth + 1,nodes);
		}
	}

	public static void printNodeInfo(Node[] nodes , int nodeNum){
		String childeren = "";
		for(int i = 0 ; i < nodeNum ; i++){
			System.out.printf("node %d: parent = %d, depth = %d, %s, [%s]\r\n",
					           i,nodes[i].parent,nodes[i].depth,getType(nodes[i]),getChilderen(nodes,i));
		}
	}

	public static String getType(Node node){
		if(node.parent == -1){
			return "root";
		}else if(node.left == -1){
			return "leaf";
		}else{
			return "internal node";
		}
	}

	public static String getChilderen(Node[] nodes,int nodeIndex){
		StringBuilder sb = new StringBuilder();
		if(nodes[nodeIndex].left != -1){
			sb.append(" ");
			sb.append(nodes[nodeIndex].left);
			sb.append(",");

			int right = nodes[nodes[nodeIndex].left].right;

			while(right != -1){
				sb.append(" ");
				sb.append(right);
				sb.append(",");
				right = nodes[right].right;
			}
			sb.delete(sb.length() - 1, sb.length());
			return sb.toString().trim();
		}else{
			return "";
		}
	}

	public static int getParentIndex(Node[] nodes){
		int i = 0;
		while(nodes[i].parent != -1){
			i++;
		}
		return i;
	}

}

class Node{

	int depth;
	int parent;
	int left;
	int right;

	public Node(){
		depth = -1;
		parent = -1;
		left = -1;
		right = -1;
	}
}