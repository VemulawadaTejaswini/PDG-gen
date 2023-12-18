
import java.util.*;
public class Main {
    public static class Pair{
        int pos;
        int state;
        public Pair(int pos,int state){
            this.pos=pos;
            this.state=state;
        }
    }
    public static int max=10005;
    public static HashMap<Integer,ArrayList<Pair>>g=new HashMap<>();
    public static int[] x=new int[max];
    public static boolean[] used=new boolean[max];
    public static ArrayList<Integer>ans=new ArrayList<>();

    public static int lower_bound(Pair[] nums, int begin, int end, Pair pair) {
        while (begin < end) {
            int mid = begin + (end - begin) / 2;
            if (nums[mid].pos < pair.pos) {
                begin = mid + 1;
            } else {
                end = mid;
            }
        }
        return begin;
    }

    public static int upper_bound(Pair[] nums, int begin, int end, Pair pair) {
        while (begin < end) {
            int mid = begin + (end - begin) / 2;
            if (nums[mid].pos <= pair.pos) {
                begin = mid + 1;
            } else {
                end = mid;
            }
        }
        return begin;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Pair[] a=new Pair[n];
        for(int i=0;i<n;i++)
        {
           a[i]=new Pair(sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(a, Comparator.comparingInt(t -> t.pos));
        x[0]=a[0].state;
        for(int i=0;i<n-1;i++)
        {
            x[i+1]=a[i].state^a[i+1].state;
        }
        x[n]=a[n-1].state;
        for(int i=0;i<m;i++)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            l=lower_bound(a,0,n,new Pair(l,0));
            //System.out.println(l);
            r=upper_bound(a,0,n,new Pair(r,1));
            //System.out.println(r);
            if(g.get(l)==null)g.put(l,new ArrayList<>());
            if(g.get(r)==null)g.put(r,new ArrayList<>());
            g.get(l).add(new Pair(r,i+1));
            g.get(r).add(new Pair(l,i+1));
        }
        for(int i=0;i<n+1;i++)
        {
            if(used[i])continue;
            try{
            if(dfs(i)==1){
                System.out.println(-1);
                return;
            }
            }catch (Exception ex)
            {
                System.out.println(-1);
                return;
            }
        }
        if(ans.size()!=0) {
            System.out.println(ans.size());
            Collections.sort(ans);
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }

    }
    public static int dfs(int v)
    {
        used[v]=true;
        int res=x[v];
        for(Pair p:g.get(v))
        {
            if(used[p.pos])continue;
            int r=dfs(p.pos);
            if(r==1) ans.add(p.state);
            res^=r;
        }
        return res;
    }
}
