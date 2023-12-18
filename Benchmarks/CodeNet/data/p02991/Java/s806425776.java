import java.util.*;
public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    List<List<Integer>> nodes = new ArrayList<>();
    for (int i = 0; i < 3*(N+1); i++) {
      nodes.add(new ArrayList<>());
    }

    int[] minDist = new int[3*(N+1)];
    for (int i = 0; i < minDist.length; i++) {
      minDist[i] = -1;
    }

    for (int i = 0; i < M; i++) {
      int u = sc.nextInt();
      int v = sc.nextInt();
      nodes.get(3*u).add(3*v+1);
      nodes.get(3*u+1).add(3*v+2);
      nodes.get(3*u+2).add(3*v);
    }

    int S = sc.nextInt();
    int T = sc.nextInt();
    
    minDist[3*S] = 0;

    // BSF
    LinkedList<Integer> queue = new LinkedList<>();
    queue.add(3*S);
    while (!queue.isEmpty()) {
      int n = queue.remove();
      if (n == 3*T) {
        break;
      }
      List<Integer> dsts = nodes.get(n);
      for (int dst : dsts) {
        if (minDist[dst] == -1 || minDist[dst] > minDist[n] + 1) {
          queue.add(dst);
          minDist[dst] = minDist[n] + 1;
        }
      }
    }
    int ans = minDist[3*T] == -1 ? -1 : minDist[3*T] / 3;
    System.out.println(ans);
  }
}
