import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Deque;
import java.util.HashMap;
import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Main{

    static int pare[];

    static int root(int v){
        if(pare[v]<0)return v;
        return pare[v]=root(pare[v]);
    }
    static int size(int v){
        return -pare[root(v)];
    }
    static void union(int v,int u){
        v =root(v);
        u =root(u);
        if(v==u)return;
        if(size(u)>size(v)){
            int tmp=u;
            u=v;
            v=tmp;
        }
        pare[v]+=pare[u];
        pare[u]=v;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] a = new long[N];
        long[] b = new long[N];
        for(int i=0;i<N;++i)a[i] =scan.nextLong();
        for(int i=0;i<N;++i)b[i] =scan.nextLong();
        Map<Long,Integer> countmap = new HashMap<>();
        long x = 0;
        for(int i=0;i<N;++i)x^=a[i];
        countmap.put(x,1);
        for(int i=0;i<N;++i){
            if(!countmap.containsKey(a[i]))countmap.put(a[i],0);
            countmap.put(a[i], countmap.get(a[i])+1);
        }
        for(int i=0;i<N;++i){
            if(!countmap.containsKey(b[i]) || countmap.get(b[i])==0){
                System.out.println(-1);
                return;
            }
            countmap.put(b[i], countmap.get(b[i])-1);
        }
        Map<Long, Deque<Integer>> bNumToIndex = new HashMap<>();
        for(int i=0;i<N;++i){
            if(!bNumToIndex.containsKey(b[i]))bNumToIndex.put(b[i],new ArrayDeque<>());
            bNumToIndex.get(b[i]).add(i);
        }
        int ans =0;
        boolean used[] = new boolean[N];
        for(int i=0;i<N;++i)if(a[i]==b[i])used[i]=true;
        boolean remX=true;
        for(int i=0;i<N;++i)if(!used[i] && b[i]==x)remX=false;
        if(!remX)ans--;
        pare = new int[2*N];
        for(int i=0;i<2*N;++i)pare[i]=-1;
        for(int i=0;i<N;++i)if(!used[i] && b[i]!=x)union(i,N+i);
        for(int i=0;i<N;++i){
            while(bNumToIndex.containsKey(a[i])&& !bNumToIndex.get(a[i]).isEmpty()){
                union(i,N+bNumToIndex.get(a[i]).poll());
            }
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<N;++i){
            if(!used[i])set.add(root(i));
            else --ans;
        }
        ans += N +set.size();


        System.out.println(ans);
    }
}