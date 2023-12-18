import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] paths = new int[n][n];
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        paths[i][j] = 0;
      }
    }
    for(int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      paths[a-1][b-1] = 1;
      paths[b-1][a-1] = 1;
    }
   // for(int[] path : paths)
     // System.out.println(Arrays.toString(path));
    int bridges = 0;
    for(int i = 0; i < n; i++) {
      ArrayList<String> paths2 = new ArrayList<String>();
      for(int j = 0; j < n; j++) {
        if(paths[i][j] == 1) {
          paths2.add(""+i+j);
        }
      }
      if(paths2.size() == 1) {
        bridges++;
        String curr = paths2.get(0);
        int a = Integer.parseInt(curr.substring(0,1));
        int b = Integer.parseInt(curr.substring(1,2));
        paths[b][a] = 0;
      } /*else if(paths2.size() >= 2) {
        for(int k = 0; k < paths2.size(); k++) {
          String curr = paths2.get(k);
          int a = Integer.parseInt(curr.substring(0,1));
          int b = Integer.parseInt(curr.substring(1,2));
          for(int s = 0; s < m; s++) {
            if(paths[b][s] == 1 && s != a) {
              
            }
          }
        }
      }*/
    }
    System.out.println(bridges);
  }
}
