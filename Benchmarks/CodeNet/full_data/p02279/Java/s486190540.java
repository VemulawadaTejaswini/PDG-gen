import java.util.*;

public class Main {
    static long count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //節点の個数
        Node[] node = new Node[n];
        for(int i=0; i<n; i++) {
            int id = sc.nextInt();
            node[id] = new Node();
            node[id].id = id;
            node[id].k = sc.nextInt();
            node[id].parent = -1;
            node[id].type = "leaf"; //初期値：葉
            if(node[id].k>0) { //次元がある場合
                node[id].child = new int[node[id].k];
                for(int j=0; j<node[id].k; j++) { //子ノードをchild[]に詰める
                    node[id].child[j] = sc.nextInt();
                }
                //タイプを内部節点に書き換える
                node[id].type = "internal node";
            }
        }
        //子ノードの親=ノードid
        for(int i=0; i<n; i++) {
            for(int j=0; j<node[i].k; j++) {
                node[node[i].child[j]].parent = node[i].id;
            }
        }
        //親がない場合、タイプを根に書き換える
        for(int i=0; i<n; i++) {
            if(node[i].parent==-1) {
                node[i].type = "root";
                for(int j=0; j<node[i].k; j++) {
                    depth(node, node[i].child[j], 1);
                }
            }
        }
        //出力
        for(int i=0; i<n; i++) {
            System.out.print("node "+node[i].id+": parent = "+node[i].parent+", depth = "+node[i].depth+", "+node[i].type+", [");
            for(int j=0; j<node[i].k; j++) {
                if(j==0) System.out.print(node[i].child[j]);
                else System.out.print(", "+node[i].child[j]);
            }
            System.out.println("]");
        }
    }
    static void depth(Node[] node, int i, int d) {
        node[i].depth = d;
        d++;
        for(int j=0; j<node[i].k; j++) {
            depth(node, node[i].child[j], d);
        }
    }
}
/**
 * クラス
 */
class Node {
    int id;
    int k;
    int[] child;
    int parent;
    int depth;
    String type;
}

