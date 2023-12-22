import java.util.Scanner;

public class Main
{
    //RMQ in aizu
    //refernece https://blog.csdn.net/u013174702/article/details/44161821
    //size 4*maxn
    static int maxN = 100005;
    static int size = 4*maxN;//segment tree
    static int tree[] = new int[size];//start from 0
    public static void main(String[] args) {
        int n,q;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        q = in.nextInt();
        int N = 1;
        while(N<n){
            N = N<<1;
        }
        //init tree
        //System.out.println(N);
        for(int i = 0; i<size; i++) tree[i] = 0x7fffffff;
        //System.out.println(tree[0]);
        //the number of max leaf
        if(N==1) N = 2;
        for(int i = 0; i<q; i++){

            int num1 = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            if(num1==0){
                update(a,a,0,N-1,b,0);
            }else if(num1==1){
                int res = query(a,b,0,N-1,0);
                System.out.println(res);
            }

        }

    }

    private static int query(int L, int R, int l, int r, int node) {
        if(l>R || r<L) return 0x7fffffff;//or mid
        if(l>=L && r<=R){
            return tree[node];
        }
        int p = query(L,R,l,(l+r)/2,node*2+1);
        int q = query(L,R,(l+r)/2+1,r,node*2+2);

        return Math.min(p,q);
    }

    //node stores min value
    //node correspond to l and r
    private static void update(int L, int R, int l, int r, int val,int node) {
        if(l>R || r<L) return;//or mid
        if(l>=L && r<=R){
            tree[node] = val;
            return;
        }
        int mid = (l+r)/2;
        //System.out.println(node+" "+l+" "+r);
        update(L,R,l,mid,val,node*2+1);
        update(L,R,mid+1,r,val,node*2+2);
        //push up
        if(tree[node*2+1]<tree[node*2+2]) tree[node] = tree[node*2+1];
        else tree[node] = tree[node*2+2];
    }
}

