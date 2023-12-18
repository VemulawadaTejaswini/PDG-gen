
import java.util.*;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final int N=scanner.nextInt();
        final int M=scanner.nextInt();
        final int[] pArray=new int[N];
        for(int i=0;i<N;i++){
            pArray[i]=scanner.nextInt();
        }
        UnionFind unionFind=new UnionFind(N);
        for(int i=0;i<M;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            unionFind.union(x-1,y-1);
        }
        int result=0;
        for(int i=0;i<N;i++){
            if(unionFind.same(i,pArray[i]-1)) result++;
        }
        System.out.println(result);
    }
}
class UnionFind{
    int n;
    int[] ints;
    public UnionFind(int n) {
        this.n = n;
        ints = new int[n];
        for(int i=0;i<n;i++){
            ints[i]=i;
        }
    }
    public int root(int x){
        if(ints[x]==x){
            return x;
        }else{
            int root=root(ints[x]);
            ints[x]=root;
            return root;
        }
    }
    public boolean same(int x,int y){
        return root(x)==root(y);
    }
    public void union(int x,int y){
        ints[root(x)]=ints[root(y)];
    }
    @Override
    public String toString(){
        return Arrays.stream(ints).mapToObj(i->String.format("%d",i)).collect(Collectors.joining(","));
    }
}