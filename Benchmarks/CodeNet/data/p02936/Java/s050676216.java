public class Main{
    int[] map;
    int[] value;
    int [] ma;
    ArrayList<ArrayList<Integer>> ne;
    public Main(int n){
        map=new int[n];
        value=new int[n];
        ne=new ArrayList<>();
        ma=new int[n];
        for(int i=0;i<n;i++){
            ArrayList<Integer> a=new ArrayList<>();
            ne.add(a);
        }
    }
    public void dfs(ArrayList<ArrayList<Integer>> old,int root){
        ma[root]=1;
        for(int i=0;i<old.get(root).size();i++){
            int v=old.get(root).get(i);
            if(ma[v]==0){
                ne.get(root).add(v);
                dfs(old,v);
            }
        }
    }
    void op(int v,int value){
        map[v]=1;
        this.value[v]+=value;
        for(int i=0;i<ne.get(v).size();i++){
            int e= ne.get(v).get(i);
            if(map[e]==0){
                op(e,value);
            }
        }
        map[v]=0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,q;
        n=sc.nextInt();
        q=sc.nextInt();
        ArrayList<ArrayList<Integer>> g=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> a=new ArrayList<>();
            g.add(a);
        }
        for(int i=0;i<n-1;i++){
            int v1=sc.nextInt()-1;
            int v2=sc.nextInt()-1;
            g.get(v1).add(v2);
            g.get(v2).add(v1);
        }
        Main m=new Main(n);
        m.dfs(g,0);
        for(int i=0;i<q;i++){
            int v,val;
            v=sc.nextInt()-1;
            val=sc.nextInt();
            m.op(v,val);
        }
        for(int i=0;i<n;i++){
            System.out.println(m.value[i]);
        }
    }
}