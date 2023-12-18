import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    List<List<Integer>> t = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      t.add(new ArrayList<>());
    }
    for (int i = 0; i < N-1; i++) {
      int a = sc.nextInt();
      a--;
      int b = sc.nextInt();
      b--;
      t.get(a).add(b);
      t.get(b).add(a);
    }
    
    if (N == 1) {
      System.out.println(K);
      return;
    }
    
    int[] child = new int[N];
    for (int i = 0; i < N; i++) {
      child[i] = -1;
    }
    LinkedList<Integer> q = new LinkedList<>();
    q.offer(0);
    while (!q.isEmpty()) {
      int p = q.poll();
      child[p] = 0;
      for (int c : t.get(p)) {
        if (child[c] == -1) {
          child[p]++;
          q.offer(c);
        }
      }
    }
    int[] power = new int[K+1];
    power[K] = 1;
    power[K-1]--;
    
    power[K-1]++;
    if (K-1-child[0] < 0) {
      Sustem.out.println(0);
      return;
    }
    power[K-1-child[0]]--;
    
    for (int i = 1; i < N; i++) {
      if (child[i] > 0) {
        power[K-2]++;
        if (K-2-child[i] < 0) {
          System.out.println(0);
          return;
        }
        power[K-2-child[i]]--;
      }
    }
    
    //System.out.println(Arrays.toString(power));
    
    int num = 0;
    for (int i = K; i >=0; i--) {
      num += power[i];
      power[i] = num;
    }
    
    long ans = 1;
    for (int i = 2; i <= K; i++) {
      while (power[i]-- > 0) {
        ans *= i;
        ans %= 1_000_000_007;
      }
    }
    
    //System.out.println(Arrays.toString(child));
    //System.out.println(Arrays.toString(power));
    System.out.println(ans);
  }
}