import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line1 = br.readLine().split(" ");
    int n = Integer.parseInt(line1[0]);
    int m = Integer.parseInt(line1[1]);
    int k = Integer.parseInt(line1[2]);
  
    int[] numFriends = new int[n];
    int[] numBlock = new int[n];
    UnionFind unionFind = new UnionFind(n);
    String[] data;
    int a;
    int b;
    
    for (int i=0; i<m; i++){
      data = br.readLine().split(" ");
      a = Integer.parseInt(data[0]) -1;
      b = Integer.parseInt(data[1]) -1;
      
      unionFind.union(a, b);
      numFriends[a]++;
      numFriends[b]++;
    }
    for (int i=0; i<k; i++){
      data = br.readLine().split(" ");
      a = Integer.parseInt(data[0]) -1;
      b = Integer.parseInt(data[1]) -1;
      
      if (unionFind.isSameRoot(a, b)){
        numBlock[a]++;
        numBlock[b]++;
      }
    }
    StringJoiner stringJoiner = new StringJoiner(" ");
    for (int i=0; i<n; i++){
      stringJoiner.add(String.valueOf(unionFind.getSize(i) - numFriends[i] - numBlock[i] - 1));
    }
    
    System.out.println(stringJoiner);
  }
  
}
class UnionFind {
  private int[] tree;
  private int[] size;
  
  UnionFind(int size){
    this.tree = new int[size];
    this.size = new int[size];
    for (int i=0; i<size; i++){
      this.tree[i] = i;
      this.size[i] = 1;
    }
  }
  
  int find(int idx) {
    if(tree[idx]==idx) return idx;
    else return tree[idx] = find(tree[idx]);
  }
  
  void union(int idx1,int idx2) {
    int root1 = find(idx1);
    int root2 = find(idx2);
    
    if (root1 == root2){
      return;
    }
    tree[root2] = root1;
    size[root1] += size[root2];
  }
  
  public boolean isSameRoot(int idx1, int idx2){
    return find(idx1) == find(idx2);
  }
  
  public int getSize(int idx){
    return size[find(idx)];
  }
}
