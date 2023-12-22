import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long [] List = new long [N+1];
        Arrays.fill(List,0);
        Set<Integer> set = new HashSet<>();
        ArrayList<node> v = new ArrayList<>();
        node v2 = new node();
        v2.element(sc.nextInt(),sc.nextInt());
        v.add(v2);
        for(int i=1;i<K;i++){
            int L = sc.nextInt();
            int R = sc.nextInt();
            for(node vv:v){
                if(vv.l>L&&R>=vv.l&&R<=vv.r) vv.l = L;
                else if(L>=vv.l&&R>vv.r&&L<=vv.r) vv.r=R;
                else if(L<vv.l&&R>vv.r){
                    vv.l = L;
                    vv.r = R;
                }
                else{
                    node V = new node();
                    V.element(L,R);
                    v.add(V);
                    break;
                }
            }
        }
        for(node n:v) {
            for(int i=n.l;i<=n.r;i++){
                set.add(i);
                if(i+1<=N)List[i+1]=1;
            }
        }
        for(int i=2;i<N;i++){
            if(List[i]!=0){
                for(int j:set){
                    if(i+j<=N)List[i+j]=(List[i+j]+List[i])%998244353;
                    else break;
                }
            }
        }
        System.out.println(List[N]);
    }
    public static class node{
        int l,r;
        public void element(int l,int r){
            this.l = l;
            this.r = r;
        }
    }
}