import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int MOD = 1000000007;
    HashMap<Integer, Integer> diff = new HashMap<Integer, Integer>();
    for(int i = 0; i < N; i++) {
      int a = sc.nextInt();
      if(diff.containsKey(a)) {
        diff.put(a, diff.get(a) + 1);
      } else {
        diff.put(a, 1);
      }
    }
    boolean flg = true;
    if(N % 2 == 0) {
      for(int i = 0; 2 * i + 1 < N; i++) {
        if(diff.get(2 * i + 1) != 2) flg = false;
      }
    } else {
      if(diff.get(0) != 1) flg = false;
      for(int i = 1; 2 * i < N; i++) {
        if(diff.get(2 * i) != 2) flg = false;
      }
    }
    int ans = 0;
    if(flg) {
      int time = N / 2;
      ans = 1;
      for(int i = 0; i < time; i++) {
        ans = (ans * 2) % MOD;
      }
    }
    System.out.println(ans);
  }
}