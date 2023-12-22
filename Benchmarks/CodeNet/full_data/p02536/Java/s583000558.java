import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int edge[][] = new int[m][2];
      for(int i=0;i<m;i++){
              edge[i][0] = sc.nextInt();
              edge[i][1] = sc.nextInt();
      }
      int parent[] = new int[n+1];
      for(int i=1;i<=n;i++){
          parent[i]=i;
      } 
     
      for(int i=0;i<m;i++){
          int ai = (int)Math.min(edge[i][0],edge[i][1]);
          int bi = (int)Math.max(edge[i][0],edge[i][1]);
          parent = union(ai,bi,parent);
      }
        parent[0] =parent[1];
        //System.out.println(Arrays.toString(parent));
      HashSet<Integer> h = new HashSet<Integer>();
      for(int i=1;i<=n;i++)
        h.add(parent[i]);
      System.out.println(h.size()-1);
    }
public static int find(int v,int[] parent){
        if(v==parent[v])
            return v;
        return find(parent[v],parent);
    }
    public static int[] union(int a,int b,int parent[]){
        a = find(a,parent);
        b = find(b,parent);
        if (a != b)
            parent[b] = a;
        return parent;
    }
}