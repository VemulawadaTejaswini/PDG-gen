import java.util.Scanner;

class Main {
	static StringBuilder sb = new StringBuilder("");
	static Node root = null;	//根っこ
	
	//名ばかりメイン
	public static void main(String args[]) {
		run();
	}
	
	//実質メイン
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		String ope;
		
		//入力
		for (int i = 0; i < num; i++) {
			ope = scanner.next();
			//命令分岐
			switch( Operate.getEnumName(ope) ){
			case in:
				insert( new Node( scanner.nextInt() ) );
				break;
			case print:
				print();
			}
		}
		
		output();//出力関数
		
		scanner.close();
	}
	
	//挿入処理
	public static void insert(Node node){
		Node parent = null;				// x の親
		Node child = root;
		while (child != null) {
			parent = child;				// 親を設定
			if (node.key < child.key) {
				child = child.left;		// 左の子へ移動
			} else {
				child = child.right;	// 右の子へ移動
			}
		}
		
		//親か子か
		if (parent == null) {
			root = node;
		} else if (node.key < parent.key) {
			parent.left = node;
		} else {
			parent.right = node;
		}
	}
	
	//先行巡回
	public static void preParse(Node node) {
		if (node == null) return;
		
		sb.append(" ").append(node.key);
		preParse(node.left);
		preParse(node.right);
	}
	//中間巡回
	public static void inParse(Node node) {
		if (node == null) return;
		
		inParse(node.left);
		sb.append(" ").append(node.key);
		inParse(node.right);
	}
	
	public static void print() {
		inParse(root);
		sb.append("\n");
		preParse(root);
		sb.append("\n");
	}
	
	//出力
	public static void output(){
		System.out.println(sb);
	}
	
	//enum宣言
	public static enum Operate{
		in("insert"),
		print("print");
		
		private final String name;
		
		Operate(String name){
			this.name = name;
		}
		
		String getName(){
			return this.name;
		}

		public static Operate getEnumName(String str){
			for(Operate v : values()){
				if(v.getName().equals(str)){
					return v;
				}
			}
			throw new IllegalArgumentException("undefined : " + str);
		}
	}

}
//クラス
class Node{
	public int key;
	public Node left;
	public Node right;
	
	public Node(int key) {
		this.key = key;
		left = right = null;
	}
	
}

