import java.util.*;

class UnionFindTree {

    int[] parent; //インデックスにとノードを対応させ、そのルートノードのインデックスを格納
    int[] rank; //parentと同様に、木の高さを格納
    int[] siz;

    public UnionFindTree(int size) {
        this.parent = new int[size];
        this.rank = new int[size];
        this.siz = new int[size];

        for (int i = 0; i < size; i++) {
            makeSet(i);
        }
    }

    public void makeSet(int i) {
        parent[i] = i;
        rank[i] = 0; //集合の高さ
        siz[i] = 1;
    }

    public void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        //xが属する木の方が大きい場合


        if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot; //yの親をxに更新
            siz[xRoot] += siz[yRoot];

        } else if(rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
            siz[yRoot] += siz[xRoot];
        } else if (xRoot != yRoot){
            parent[yRoot] = xRoot;
            rank[xRoot]++; //同じ高さの木がルートの子として着くから大きさ++;
            siz[xRoot] += siz[yRoot];
        }


    }

    //引数の属する木のルートのidを返す
    public int find(int i) {
        if (i != parent[i]) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    //同じ木に属しているか
    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
    public int getSize(int i) {
        return siz[find(i)];
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] ans = new int[N];
        int[] friendNum = new int[N];
        int[] blockNum = new int[N];
        UnionFindTree uft = new UnionFindTree(N);

        for(int i=0;i<M;i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            uft.union(a,b);
            friendNum[a]++;
            friendNum[b]++;

        }

        for(int i=0;i<K;i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            if(uft.same(a,b)){
                blockNum[a]++;
                blockNum[b]++;
            }

        }


        for(int i=0;i<N;i++){
//            System.out.print("size:"+uft.getSize(i));
//            System.out.print("friend"+friendNum[i]);
//            System.out.print("block"+blockNum[i]);
//            System.out.print("root"+uft.find(i));
            System.out.print(uft.getSize(i) - friendNum[i] - blockNum[i]-1 +" ");
        }

    }

}







