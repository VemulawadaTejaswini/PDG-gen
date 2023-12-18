import java.util.Scanner;
 
public class Main {
  class UnionFind {
    int[] parent;
    int[] size;
    int n;

    UnionFind(int n) {
      this.parent = new int[n];
      this.size = new int[n];
      this.n = n;
      for (int i = 0; i < n; i++) {
        this.parent[i] = i;
        this.size[i] = 1;
      }
    }

    void union(int a, int b) {
      int pa = find(a);
      int pb = find(b);

      if (pa == pb) {
        return;
      }

      this.size[pa] += this.size[pb];
      this.parent[pb] = pa;
    }

    int find(int a) {
      if (this.parent[a] == a) {
        return a;
      } else {
        return find(this.parent[a]);
      }
    }

    @Override
    public String toString() {      
      String ret = "";
      for (int i = 0; i < this.n; i++) {
        ret += this.parent[i] + " ";
      }
      ret += '\n';
      for (int i = 0; i < this.n; i++) {
        ret += this.size[i] + " ";
      }
      return ret;
    }
  }

  void run() {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    int l = sc.nextInt();

    UnionFind kUnionFind = new UnionFind(n);
    UnionFind lUnionFind = new UnionFind(n);

    for (int i = 0; i < k; i++) {
      int p = sc.nextInt() - 1;
      int q = sc.nextInt() - 1;
      kUnionFind.union(p, q);
    }

    for (int i = 0; i < l; i++) {
      int p = sc.nextInt() - 1;
      int q = sc.nextInt() - 1;
      if (kUnionFind.find(p) != kUnionFind.find(q)) {
        continue;
      }
      lUnionFind.union(p, q);
    }

    String tab = "";
    for (int i = 0; i < n; i++) {
      int parent = lUnionFind.find(i);
      System.out.print(tab + lUnionFind.size[parent]);
      tab = " ";
    }
    System.out.println();
  }
 
  public static void main(String[] args) {
    new Main().run();
  }
}
