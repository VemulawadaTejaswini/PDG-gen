import java.util.*;
import java.util.Comparator;
 
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);       
        int n=sc.nextInt();
        String o="YES";
        int[] a=new int[n];
      BinarySearchTree t=new BinarySearchTree();
        for(int i=0;i<n;i++){
        	a[i]=sc.nextInt();
            if(t.contains(a[i])){
            	o="NO";
                System.out.println(o);
                return;
            }else{
            	t.add(a[i]);
            }
            /*for(int j=0;j<i;j++){
            	if(a[j]==a[i]){
                	o="NO";
                    System.out.println(o);
                    return;
                }
            }*/
        }
      System.out.println(o);
    }
}
class Node {
    int data;
    Node left;
    Node right;
}

class BinarySearchTree {
    private Node root;
  public void add(int data) {
    // ツリーがない場合の特別処理
    if (root == null) {
        root = new Node();
        root.data = data;
        return;
    }

    // 現在ノードをルートノードとする
    Node current = root;
    while (true) {
        // 「追加する値 ＜ 現在ノードの値」なら左の子を対象とする
        if (data < current.data) {
            // 次のノードが存在しない場合はその位置にデータを追加する
            if (current.left == null) {
                current.left = new Node();
                current.left.data = data;
                return;
            }
            // 存在する場合は次のノードを現在ノードとして繰り返す
            current = current.left;
        }
        // 「現在ノードの値 ≦ 追加する値」なら右の子を対象とする
        else if (current.data <= data) {
            if (current.right == null) {
                current.right = new Node();
                current.right.data = data;
                return;
            }
            current = current.right;
        }
    }
}
  public boolean contains(int data) {
    // 現在ノードをルートノードとする
    Node current = root;
    // 次のノードが存在しない場合は探索終了
    while (current != null) {
        // 等しければ探索終了
        if (current.data == data) {
            return true;
        }
        // 「探索値 ＜ 現在ノードの値」なら左の子に進む
         else if (data < current.data) {
            current = current.left;
        }
        // 「現在ノードの値 ＜ 探索値」なら右の子に進む
         else if (current.data < data) {
            current = current.right;
        }
    }
    return false;
  }
}