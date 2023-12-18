import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean debug = true;

    public static class Node {
    	List<Node> children = new ArrayList<Node>();
    	long v = 0;

    	public void addChild(Node n) {
    		this.children.add(n);
    	}

    	public void addValue(long v) {
    		this.v += v;
    	}

    	public long getValue() {
    		return this.v;
    	}

    	public void calc(long parentValue) {
    		this.v += parentValue;

    		for(Node child : children) {
    			child.calc(this.v);
    		}
    	}

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

       	int n = sc.nextInt();
        int q = sc.nextInt();

        // Node番号から直接Nodeを取れるインデックスを生成しとく
        Node[] nodes = new Node[n];

        for(int i=0; i < n; i++){
        	nodes[i] = new Node();
        }

        // 親子関係をグラフに保存
        for(int i=0; i < n - 1; i++){
            int p = sc.nextInt();
            int c = sc.nextInt();

            nodes[p - 1].addChild(nodes[c - 1]);
        }

        // 一旦全ての操作の値を各Nodeに保存（子に対する計算はしない）
        for(int i = 0; i < q; i++){
            int key = sc.nextInt();
            long value = sc.nextLong();

            nodes[key - 1].addValue(value);
        }

        // グラフをたどって部分木の値を計算
        nodes[0].calc(0);

        // 出力してみる
        for(Node node : nodes){
            System.out.print(node.getValue() + " ");
        }
    }

    public static void d(String message){
        if(debug){
            System.out.println(message);
        }
    }
}
