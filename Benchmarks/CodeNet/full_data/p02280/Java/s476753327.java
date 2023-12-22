
import java.util.Scanner;

public class Main {

    static int n;
    static int[] D,H;
    static Node node[];
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int v;
        H = new int[n];
        D = new int[n];
        node = new Node[n];
        for(int i = 0; i < n;i++){
            node[i] = new Node();
        }

        int r,l;
        for(int i = 0; i < n; i++){
            v = sc.nextInt();
            l = sc.nextInt();
            r = sc.nextInt();
            node[i].l = l;
            node[i].r = r;
            if(l != -1) node[l].p = i;
            if(r != -1) node[r].p = i;
        }
        
        int root=-1;
        for(int i = 0; i< n; i++){
            if (node[i].p == -1) root = i;
        }
        setDepth(root, 0);
        setHeight(root);
        for(int i = 0; i < n; i++){
            print(i);
        }
        

    }
    
    static void setDepth(int u, int d){
        if(u == -1) return;
        setDepth(node[u].l, d + 1);
        setDepth(node[u].r, d + 1);
        D[u] = d;
        return;
    }
    static int getSibling(int i){
        Node p;
        if(node[i].p != -1){
            p = node[node[i].p];
        }else{
            return -1;
        }
        if (p.l != -1 && p.l != i) return p.l;
        if (p.r != -1 && p.r != i) return p.r;
        return -1;
        
    }
    static int setHeight(int u){
        int h1,h2;
        h1=h2=0;
        if(node[u].l != -1) h1 = setHeight(node[u].l) + 1;
        if(node[u].r != -1) h2 = setHeight(node[u].r) + 1;
        H[u] = Math.max(h1, h2);
        return H[u];
    }
    
    static void print(int i){
        String type = "";
        int deg = 0;
        if(node[i].l != -1) deg++;
        if(node[i].r != -1) deg++;
        
        if (node[i].p == -1){
            type = "root";
        }else if(node[i].l != -1 || node[i].r != -1){
            type = "internal node";
        }else{
            type = "leaf";
        }
        System.out.printf("node %d: parent = %d, sibling = %d, degree = %d, depth = %d, height = %d, %s\n",i,node[i].p, getSibling(i),deg, D[i], H[i], type);
    }

}

class Node{
    int p,r,l;
    Node(){
        p = r = l = -1;
    }
}

