import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line1 = br.readLine().split(" ");
    int n = Integer.parseInt(line1[0]);
    int m = Integer.parseInt(line1[1]);
    int k = Integer.parseInt(line1[2]);
  
    Map<Integer, Set<Integer>> remove = new HashMap<>();
    UnionFind unionFind = new UnionFind(n);
    String[] data;
    int a;
    int b;
    
    for (int i=0; i<m; i++){
      data = br.readLine().split(" ");
      a = Integer.parseInt(data[0]) -1;
      b = Integer.parseInt(data[1]) -1;
      
      unionFind.union(a, b);
      if(!remove.containsKey(a)){
        remove.put(a, new HashSet<>());
      }
      if(!remove.containsKey(b)){
        remove.put(b, new HashSet<>());
      }
      remove.get(a).add(b);
      remove.get(b).add(a);
    }
    for (int i=0; i<k; i++){
      data = br.readLine().split(" ");
      a = Integer.parseInt(data[0]) -1;
      b = Integer.parseInt(data[1]) -1;
      
      if(!remove.containsKey(a)){
        remove.put(a, new HashSet<>());
      }
      if(!remove.containsKey(b)){
        remove.put(b, new HashSet<>());
      }
      remove.get(a).add(b);
      remove.get(b).add(a);
    }
    StringJoiner stringJoiner = new StringJoiner(" ");
    Set<Integer> tempSet;
    for (int i=0; i<n; i++){
      tempSet = unionFind.getAllElem(i);
      tempSet.removeAll(remove.get(i));
      stringJoiner.add(String.valueOf(tempSet.size()-1));
    }
    System.out.println(stringJoiner);
  }
  
}
class UnionFind {
  int[] tree;
  
  UnionFind(int size){
    tree = new int[size];
    for (int i=0; i<size; i++){
      tree[i] = i;
    }
  }
  
  public int find(int idx) {
    if(tree[idx]==idx) return idx;
    else return tree[idx] = find(tree[idx]);
  }
  
  public void union(int idx1,int idx2) {
    int root1 = find(idx1);
    int root2 = find(idx2);
    tree[root2] = root1;
  }
  
  public Set<Integer> getAllElem(int idx){
    Set<Integer> result = new HashSet<>();
    int root = find(idx);
    for (int i=0; i<tree.length; i++) {
      if (find(i) == root) {
        result.add(i);
      }
    }
    return result;
  }
}
