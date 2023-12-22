import java.util.*;

class UnionFind{
    int[] index;
    public UnionFind(int n){
        index = new int[n];
        for(int i=0; i<n; i++)
            index[i] = i;
    }
    int find(int x){
        if(index[x]==x)
            return x;
        else
            return index[x] = find(index[x]);
    }
    boolean same(int x, int y){
        return find(x) == find(y);
    }
    void union(int x, int y){
        int rootx = find(x);
        int rooty = find(y);
        if(rootx == rooty)
            return;
        else
            index[rootx] = rooty;
    }
    void printIndex(){
        for(int i=0; i<index.length; i++)
            System.out.print(" " + index[i]);
        System.out.println("");
    }

}
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        UnionFind unionFind = new UnionFind(scanner.nextInt());
        int m = scanner.nextInt();
        //unionFind.printIndex();
        for(int i=0; i<m ; i++){
            unionFind.union(scanner.nextInt(), scanner.nextInt());
           // unionFind.printIndex();
        }
   
/*         for(int k=0; k<group.length ;k++)
             System.out.print(group[k].id+" ");
         System.out.println("");*/
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++){
            int s = scanner.nextInt();
            int t = scanner.nextInt();
            if (unionFind.same(s,t))
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
 

}