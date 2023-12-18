import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long MOD = 1000000007;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i = 0; i < N; i++) {
      int a = sc.nextInt();
      if(map.containsKey(a)) {
        map.put(a, map.get(a) + 1);
      } else {
        map.put(a, 1);
      }
    }
    boolean flg = true;
    for(int i = 1; i <= N; i++) {
      if(i % 2 == 1) {
        if(i == N) {
          if(map.get(N - i) != 1) flg = false;
        } else {
          if(map.get(N - i) != 2) flg = false;
        }
      }
    }
    long ans = 0;
    if(flg) {
      ans = 1;
      int power = N / 2;
      for(int i = 0; i < power; i++) {
        ans = (ans * 2) % MOD;
      }
    }
    System.out.println(ans);
  }
}