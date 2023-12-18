import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      long[] sum = new long[n];
      sum[0] = sc.nextInt();
      for(int i = 1; i < n; i++)
        sum[i] = sum[i-1] + sc.nextInt();

      Map<Integer, Integer> cntMap = new HashMap<>();
      for(int i = 0; i < n; i++) {
        int remainder = (int)(sum[i] % m);
        cntMap.put(remainder, cntMap.getOrDefault(remainder, 0) + 1);
      }
      long cnt = cntMap.getOrDefault(0,0);
      for(Map.Entry<Integer, Integer> entry : cntMap.entrySet()) {
        if(entry.getValue() < 2) continue;
        cnt += comb(entry.getValue());
      }
        
      System.out.println(cnt);
  }

  private static long comb(int n) {
    return n * (n - 1) / 2;
  }
}