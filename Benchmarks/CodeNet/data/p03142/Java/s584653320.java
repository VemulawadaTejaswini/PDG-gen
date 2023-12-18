import java.util.*;

public class Main {
    static Node[] tree;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n-1+m][2];
        tree = new Node[n];
        for(int i=0; i<n; i++) tree[i] = new Node(i);
        for(int i=0; i<n-1+m; i++){
            a[i][0] = sc.nextInt() - 1;
            a[i][1] = sc.nextInt() - 1;
            tree[a[i][0]].add(a[i][1]);
            tree[a[i][1]].added();
        }

        int root = 0;
        for(int i=0; i<n; i++){
            if(tree[i].nump == 0) root = i;
        }
        tree[root].calcLen(-1, 0, tree);

        for(int i=0; i<n; i++){
            System.out.println(tree[i].par+1);
        }
    }
}

class Node{
    public int id;
    public int numc;
    public int nump;
    public ArrayList<Integer> chi;
    public int maxlen;
    public ArrayList<Integer[]> len;
    public int par;
    public Node(int id){
        this.id = id;
        numc = 0;
        nump = 0;
        chi = new ArrayList<Integer>();
        maxlen = -1;
        len = new ArrayList<Integer[]>();
        par = -1;
    }

    public void add(int to){
        numc++;
        chi.add(to);
    }

    public void added(){
        nump++;
    }

    public void calcLen(int from, int len, Node[] tree){
        this.len.add(new Integer[]{from, len});
        if(len > maxlen){
            maxlen = len;
            par = from;
            for(int i=0; i<numc; i++){
                tree[chi.get(i)].calcLen(id, maxlen+1, tree);
            }
        }
    }
}