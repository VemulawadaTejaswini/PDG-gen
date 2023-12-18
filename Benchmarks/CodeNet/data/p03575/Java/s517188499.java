import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      
      int[][] edges = new int[m][2];
      for(int i = 0; i < m; i++) {
        edges[i][0] = sc.nextInt();
        edges[i][1] = sc.nextInt();
      }

      int cnt = 0;
      for(int i = 0; i < m; i++) {
          int[] root = new int[n+1];
          for(int k = 1; k < root.length; k++)
              root[k] = k;
          int[] size = new int[n+1];
          Arrays.fill(size, 1);

          for(int j = 0; j < m; j++) {
             if(j == i) continue;
             union(edges[j][0], edges[j][1], root, size);
          }
          int rootCnt = 0;
          for(int k = 1; k < root.length; k++)
              if(root[k] == k) rootCnt++;
          if(rootCnt > 1) cnt++;
      }
      System.out.println(cnt);
  }

  private static void union(int a, int b, int[] root, int[] size) {
      int rootA = find(a, root);
      int rootB = find(b, root);

      if(rootA == rootB) return;

      if(size[rootA] > size[rootB]) {
          root[rootB] = rootA;
          size[rootA] += size[rootB];
      } else {
          root[rootA] = rootB;
          size[rootB] += size[rootA];
      }
  }

  private static int find(int a, int[] root) {
      if(a != root[a]) {
          root[a] = find(root[a], root);
      }
      return root[a];
  }
}
