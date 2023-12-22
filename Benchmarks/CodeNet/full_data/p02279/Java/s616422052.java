import java.util.*;

class Node{
	int parent;
	int depth;
	public ArrayList<Integer> children;
	
	Node(){
		children = new ArrayList<Integer>();
		parent = -1;
	}
	
	public int getParent() {
		return parent;
	}
	
	public void setParent(int parent) {
		this.parent = parent;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
}

public class Main {
	Scanner sc = new Scanner(System.in);
	StringBuilder output = new StringBuilder();
	
	//節点の個数
	int n;
	
	//木構造を示す配列。クラスNodeは自分で定義した。
	Node nodes[];
	
	//題意より以下は入力のための変数
	/*
	 * id 親
	 * k 親の配下の子ノードの数
	 * child 各子ノードの値
	 */
	int id,k,child;
	
	public void input() {
		n = sc.nextInt();
		nodes = new Node[n];
		//インスタンス化
		for(int i=0; i<n; i++) nodes[i] = new Node(); 
	}
	
	public void solve() {
		for(int i=0; i<n; i++) {
			id = sc.nextInt();
			k = sc.nextInt();
			for(int j=0; j<k; j++) {
				child = sc.nextInt();
				nodes[id].children.add(child);
				nodes[child].setParent(id);
			}
		}
		
		for(int i=0; i<n; i++) {
			//ノードが根だった場合深さは0に設定する
			if(nodes[i].getParent() == -1) compute(i,0);
		}
	}
	
	public void compute(int id, int value) {
		nodes[id].setDepth(value);
		//根以降のノードは深さがプラス１した値になるので再帰で呼び出してセットする
		for(int i=0; i<nodes[id].children.size(); i++) compute(nodes[id].children.get(i), value+1);
	}
	
	public void output() {
		for(int i=0; i<n; i++) {
			output.append("node ").append(Integer.toString(i)).append(": parent = ").append(Integer.toString(nodes[i].getParent())).append(", depth = ").append(Integer.toString(nodes[i].getDepth())).append(", ");
			if(nodes[i].getParent() == -1) output.append("root, ");
			else if(nodes[i].children.size() == 0) output.append("leaf, ");
			else output.append("internal node, ");
			
			output.append("[");
			if(nodes[i].children.size() > 0) {
				output.append(Integer.toString(nodes[i].children.get(0)));
				for(int j=1; j<nodes[i].children.size(); j++) output.append(", ").append(Integer.toString(nodes[i].children.get(j)));
			}
			output.append("]\n");
		}
		System.out.print( output.toString() );
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.solve();
		obj.output();
	}
}
