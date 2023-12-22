import java.util.*;
class UnionFind {
    private int[] _parent;
    private int[] _rank;
    
    public int find(int i){
      int p = _parent[i];
      if(i == p){
        return i;
      }
      return _parent[i] = find(p);
    }
    
    public void union(int i, int j){
      int root1 = find(i);
      int root2 = find(j);
      
      if(root1 == root2){
        return;
      }
      
      if(_rank[root1] > _rank[root2]){
        _parent[root2] = root1;
      } else if(_rank[root2] > _rank[root1]){
        _parent[root1] = root2;
      } else{
        _parent[root2] = root1;
        _rank[root1]++;
      }
    }
    
    public UnionFind(int max){
      _parent = new int[max];
      _rank = new int[max];
      
      for(int i = 0; i < max; i++){
        _parent[i] = i;
      }
    }
    
    public boolean same(int i, int j){
      int root1 = find(i);
      int root2 = find(j);
      
      return root1 == root2;
    }
}

public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      UnionFind uf = new UnionFind(N);
      
      // 都市を結ぶ
      for(int i = 0; i < M; i++){
        int A = sc.nextInt()-1;
        int B = sc.nextInt()-1;
        
        uf.union(A,B);
      }
      
      // 必要な道路数カウント
      int count = 0;
      for(int i = 0; i < N; i++){
        if(!uf.same(0,i)){
          uf.union(0,i);
          count++;
        }
      }
      
      // 出力
      System.out.println(count);
    }
    

}