import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] mtx = new int[N][N];

    for (int i = 0; i < N; i++) {
      String s = sc.next();
      for (int k = 0; k < s.length(); k++) {
        mtx[i][k] = Integer.parseInt(s.charAt(k)+"");
      }
    }

    int ans = -1;
    for (int i = 0; i < N; i++) {
      List<List<Integer>> vList= bfs(mtx,i);
      if(vList!=null){
        ans = Math.max(ans,vList.size());
      }
    }
    System.out.println(ans);
  }
static
  private List<List<Integer>> bfs(int[][] mtx, int i){

    int N = mtx.length;
    List<List<Integer>> list = new ArrayList<>(1000);
    boolean[] visited = new boolean[N];
    Queue<int[]> q = new LinkedList<>();
    int[] node= {i,0};
  visited[i] = true;
    q.offer(node);

    while(!q.isEmpty()){
      int[] nextNode = q.remove();

      int next= nextNode[0];
      int step = nextNode[1]; // Vi

      if(list.size()==step){
        list.add(step,new ArrayList<>());
      }
      list.get(step).add(next);

      for (int j = 0; j < N ; j++) {
        int adj = mtx[next][j];
        if(adj ==1 && !visited[j]){
          int[] adjNode= {j,step+1};
          visited[j] = true;
          q.offer(adjNode);
        }
      }
    }

    //Verify the self connected in Vi
    for (int j = 0; j < list.size(); j++) {//each V
      List<Integer> l = list.get(j);
      for (int k = 0; k < l.size() ; k++) {
        for (int m = k+1; m < l.size() ; m++) {
          if(mtx[k][m] == 1) return null;
        }
      }
    }
    return list;
  }


}
