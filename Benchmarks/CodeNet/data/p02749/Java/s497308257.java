import java.util.*;

public class Main {
  public static int n;
  public static int[] c;
  public static ArrayList[] edge;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    c = new int[n];
    edge = new ArrayList[n];
    for(int i = 0; i < n; i++) {
      edge[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < n - 1; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      edge[a].add(b);
      edge[b].add(a); 
    }
    dfs(0, -1);
    int p1 = 0;
    int p2 = 0;
    for(int i = 0; i < n; i++) {
      if(c[i] == 0) {
        p1++;
      } else {
        p2++;
      }
    }
    int[] ans = new int[n];
    int[] used = new int[n + 1];
    
    if(p1 <= (n / 3)) {
      int p = 1;
      for(int i = 0; i < n; i++) {
        if(c[i] == 0) {
          ans[i] = (3 * p);
          p++;
          used[ans[i]] = 1;
        }
      }
      ArrayList<Integer> list = new ArrayList<Integer>(); 
      for(int i = 1; i <= n; i++) {
        if(used[i] == 0) list.add(i);
      }
      int q = 0;
      for(int i = 0; i < n; i++) {
        if(c[i] == 1) {
          ans[i] = list.get(q);
          q++;
        }
      }
    } else if(p2 <= (n / 3)) {
      int p = 1;
      for(int i = 0; i < n; i++) {
        if(c[i] == 1) {
          ans[i] = (3 * p);
          p++;
          used[ans[i]] = 1;
        }
      }
      ArrayList<Integer> list = new ArrayList<Integer>(); 
      for(int i = 1; i <= n; i++) {
        if(used[i] == 0) list.add(i);
      }
      int q = 0;
      for(int i = 0; i < n; i++) {
        if(c[i] == 0) {
          ans[i] = list.get(q);
          q++;
        }
      }      
    } else {
      int p = 0;
      int q = 0;
      for(int i = 0; i < n; i++) {
        if(c[i] == 0) {
          if((3 * p + 1) <= n) {
            ans[i] = (3 * p + 1);
            p++;
          }
        } else {
        if(c[i] == 1) {
          if((3 * q + 2) <= n) {
            ans[i] = (3 * q + 2);
            q++;
          }          
        }
        }
      }
      int r = 1;
      for(int i = 0; i < n; i++) {
        if(ans[i] == 0) {
          ans[i] = (3 * r);
          r++;
        }
      }
    }
    for(int i = 0; i < n; i++) {
      System.out.println(ans[i]);
    }
  }

  public static void dfs(int v, int p) {
    for(int i = 0; i < edge[v].size(); i++) {
      int t = (int)(edge[v].get(i));
      if(t != p) {
        c[t] = 1 - c[v];
        dfs(t, v);
      }
    }    
  }
}