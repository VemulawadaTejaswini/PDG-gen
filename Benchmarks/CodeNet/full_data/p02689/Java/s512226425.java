import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int M = in.nextInt();
    
    int[] nums = new int[N];
    
    for (int i = 0; i < N; i++) {
      nums[i] = in.nextInt();
    }
    
    HashMap<Integer, Set<Integer>> map = new HashMap<>();
    for (int i = 0; i < M; i++) {
      int A = in.nextInt() - 1;
      int B = in.nextInt() - 1;

      if (!map.containsKey(A)) {
        map.put(A, new HashSet<Integer>());
      }
      if (!map.containsKey(B)) {
        map.put(B, new HashSet<Integer>());
      }

      map.get(A).add(B);
      map.get(B).add(A);
    }

    int ans = 0;
    for (int i = 0; i < N; i++) {
      Set<Integer> path = map.get(i);
      if (path == null) {
        ans++;
        continue;
      }
      boolean shouldAdd = true;
      for (Integer j : path) {
        if (nums[j] >= nums[i]) {
          shouldAdd = false;
          break;
        }
      }

      if (shouldAdd) {
        ans++;
      }
    }

    System.out.println(ans);
  }
}
