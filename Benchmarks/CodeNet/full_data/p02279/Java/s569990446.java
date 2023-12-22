import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		run();
	}
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
        Node[] node = new Node[num];
        boolean[] root = new boolean[num];
        Arrays.fill(root, true);
		//要素ごとの親と子の関係構築
		for(int i = 0; i < num; i ++ ){
			int id = scanner.nextInt();
            int k = scanner.nextInt();
            int[] children = new int[k];
            for (int j = 0; j < k; j++) {
                children[j] = scanner.nextInt();
                root[children[j]] = false;
            }
            node[id] = new Node(children);
		}
		
		//ノードごとにデータ作成
		for( int i = 0; i < num ; i ++ ){
			if( root[i] ){
				tree( node, -1, i, 0 );
			}
		}		
		
		output(node, num);
		
		scanner.close();
	}
	
	public static void output(Node[] node, int num){
	   //出力
	   StringBuilder sb = new StringBuilder("");
	   for (int i = 0; i < num; i++) {
			sb.append(node[i].tree).append("\n");
	   }
		System.out.print(sb);
	}
	
	public static void tree(Node[] nodes, int parent, int id, int depth){ 
		StringBuilder sb = new StringBuilder("");
		sb.append("node ").append(id).append(": parent = ").append(parent)
			.append(", depth = ").append(depth).append(", ");
		
		if (parent == -1) sb.append("root");
        else if (nodes[id].children.length == 0) sb.append("leaf");
        else sb.append("internal node");
 
        sb.append(", [");
        for (int i = 0; i < nodes[id].children.length; i++) {
            sb.append(nodes[id].children[i]);
            if (i != nodes[id].children.length - 1) sb.append(", ");
 
            tree(nodes, id, nodes[id].children[i], depth + 1);
        }
        sb.append("]");
        nodes[id].tree = sb.toString();
	}
}
class Node{
    public int[] children;
    public String tree;
    public Node(int[] children) {
        this.children = children;
    }
	
}

