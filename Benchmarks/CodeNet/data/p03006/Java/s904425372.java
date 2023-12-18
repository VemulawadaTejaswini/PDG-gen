import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[][] coord = new long[n][2];
      for(int i = 0; i < n; i++) {
        coord[i][0] = sc.nextInt();
        coord[i][1] = sc.nextInt();
      }
      Map<String, Long> cntMap = new HashMap<>();
      for(int i = 0; i < n - 1; i++) {
        for(int j = i + 1; j < n; j++) {
          long dx = coord[i][0] - coord[j][0];
          long dy = coord[i][1] - coord[j][1];
          String key = dx + "," + dy;
          cntMap.put(key, cntMap.getOrDefault(key, 0L) + 1);
        }
      }
      Long max = 0L;
      for(Long cnt : cntMap.values()) {
        max = Math.max(max, cnt);
      }
      System.out.println(n - max);
  }
}