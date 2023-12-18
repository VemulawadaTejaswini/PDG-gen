import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
    int[][] given = new int[m][2];
    for(int i = 0; i < n; i++) {
      paths.add(new ArrayList<Integer>());
    }
    for(int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      paths.get(a-1).add(b-1);
      paths.get(b-1).add(a-1);
      given[i][0] = a-1;
      given[i][1] = b-1;
    }
    /*for(int i = 0; i < n; i++) {
      for(int j = 0; j < paths.get(i).size(); j++) {
        System.out.print(paths.get(i).get(j) + " ");
      }
      System.out.println();
    }*/
    int bridges = 0;
    for(int i = 0; i < m; i++) {
      paths.get(given[i][0]).remove((Object)given[i][1]);
      paths.get(given[i][1]).remove((Object)given[i][0]);
      boolean[] visited = new boolean[n];
      dfs(0, visited, paths);
      for(int j = 0; j < n; j++) {
        if(!visited[j]) {
          bridges++;
          break;
        }
      }
      paths.get(given[i][0]).add(given[i][1]);
      paths.get(given[i][1]).add(given[i][0]);
    }
    System.out.println(bridges);
  }
  
  private static void dfs(int u, boolean[] visited, ArrayList<ArrayList<Integer>> list) {
    visited[u] = true;
    for(int i = 0; i < list.get(u).size(); i++) {
      int curr = list.get(u).get(i);
      if(!visited[curr]) {
        dfs(curr, visited, list);
      }
    }
  }
}
