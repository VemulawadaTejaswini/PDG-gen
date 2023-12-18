import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int a[] = new int[n];
    for (int i=0; i<n; i++){
      a[i] = 0;
    }
    
    int x;
    int y;
    int z;
    int ans=0;

    for (int i=0; i<m; i++) {
      x = Integer.parseInt(sc.next());
      y = Integer.parseInt(sc.next());
      z = Integer.parseInt(sc.next());
      a[x-1] += 1;
      a[y-1] += 1;
    }
    
    for (int i=0; i<n; i++) {
      if (a[i]==0 || a[i]==1) {
        ans++;
      }
    }
    
    System.out.println(ans);
  }
}
