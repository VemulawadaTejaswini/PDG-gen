import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int Q = sc.nextInt();

        int[] s = new int[N];
        for(int i = 0 ; i < N ; i++){
            s[i] = 1 << (S.charAt(i) - 'a');
        }

        SegmentTreeInt seg = new SegmentTreeInt(s, (i, j) -> {return i|j;}, 0);

        for(int i = 0 ; i < Q ; i++){
            int type = sc.nextInt();
            if(type == 1){
                int ind = sc.nextInt();
                String c = sc.next();

                seg.set(ind-1, 1 << (c.charAt(0)-'a'));
            }else{
                int left = sc.nextInt();
                int right = sc.nextInt();

                int letters = seg.getValueInRange(left-1, right);
                int ans = 0;
                for(int j = 0 ; j < 26 ; j++){
                    if(((letters >> j) & 1) == 1){
                        ans++;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}

/*
    int配列データからSeg木を作る
    SegmentTreeInt(int[] data, IntBinaryOperator monoid, int INF)
    で生成し，
    set(int index, int data)
    で更新
    getValueInRange(int left, int right)
    で[left, right)を取得
 */

class SegmentTreeInt {
    final int INF;
    final int size;
    final int depth;
    final int nodeNum;
    final IntBinaryOperator monoid;
    int[] node;

    SegmentTreeInt(int[] data, IntBinaryOperator monoid, int INF) {
        this.INF = INF;
        size = data.length;
        depth = lg(size-1)+1;
        nodeNum = (1 << depth) - 1;
        node = new int[nodeNum];
        this.monoid = monoid;

        for (int i = 0; i < (nodeNum >> 1); i++) {
            node[i] = INF;
        }
        for (int i = 0; i < size; i++) {
            node[getIndex(i)] = data[i];
        }
        for (int i = (nodeNum >> 1) + size; i < nodeNum; i++) {
            node[i] = INF;
        }

        for (int i = (nodeNum >> 1) - 1; i >= 0; i--) {
            node[i] = monoid.applyAsInt(node[(i << 1) + 1], node[(i << 1) + 2]);
        }
    }

    //index番目のデータをdataに変更し、Seg木を更新する
    void set(int index, int data) {
        if (index < 0 || index >= size) {
            return;
        }
        index = getIndex(index);
        node[index] = data;
        while (index >= 0) {
            index = update(index);
        }
    }

    //[left, right)のSeg木の値を取得する
    int getValueInRange(int left, int right) {
        int ans = INF;
        int time = depth-1;

        while (left < right) {
            if ((left & 1) == 1) {
                ans = monoid.applyAsInt(ans, node[getIndex(left, time)]);
                left++;
            }
            left >>= 1;
            if ((right & 1) == 1) {
                right--;
                ans = monoid.applyAsInt(ans, node[getIndex(right, time)]);
            }
            right >>= 1;

            time--;
        }

        return ans;
    }

    //指定したノードの親ノードを更新し、そのノード番号を返す
    private int update(int tar) {
        if (tar == 0) {
            return -1;
        }
        int parent = ((tar + 1) >> 1) - 1;
        node[parent] = monoid.applyAsInt(node[(parent << 1) + 1], node[(parent << 1) + 2]);
        return parent;
    }

    private int getIndex(int index) {
        return index + (nodeNum >> 1);
    }

    private int getIndex(int index, int depth) {
        return index + (nodeNum >> (this.depth - depth));
    }

    static int lg(int tar) {
        int ans = 0;
        for (; tar > 0; tar >>= 1) {
            ans++;
        }
        return ans;
    }

    public String toString() {
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < nodeNum; i++) {
            strb.append("" + node[i] + ",");
        }
        return strb.toString();
    }
}
