import java.util.Scanner;

class Tree {

  static int[] a = new int[100000];
  static int[] b = new int[100000];
  static int[] c = new int[100000];
  static int[] de = new int[100000];
  static int n;

  static void Depth(int a, int i) {
          de[a] = i;
          if(c[a] != -1) Depth(c[a],i);
          if(b[a] != -1) Depth(b[a], i + 1);
  }

  static void Print(int u) {
          int i,k;
          System.out.print("node " + u + ": parent = " + a[u] + " depth = " + de[u] + " ");

          if(a[u] == -1) System.out.print("root, ");
          else if(b[u] == -1) System.out.print("leaf, ");
          else System.out.print("internal node, ");

          System.out.print("[");

          for(i = 0, k = b[u]; k != -1; i++, k = c[k]) {
                  if(i != 0) System.out.print(", ");
                  System.out.print(k);
          }
          System.out.println("]");
  }

  public static void main(String[] args) {
    Scanner In = new Scanner(System.in);
    int i,j,node,degree,child,left,right=0;

    left = In.nextInt();
    n = In.nextInt();

    for(i = 0; i < n; i++) {
      a[i] = -1;
      b[i] = -1;
      c[i] = -1;
    }

    for(i = 0; i < n; i++) {
      node = In.nextInt();
      degree = In.nextInt();
      for(j = 0; j < degree; j++) {
        child = In.nextInt();
        if(j == 0)  b[node] = child;
        else c[left] = child;
        left = child;
        a[child] = node;
      }
    }

    for(i = 0; i < n; i++) {
      if(a[i] == -1) right = i;
    }

    Depth(right, 0);

    for(i = 0; i < n; i++) {
      Print(i);
    }
  }
}