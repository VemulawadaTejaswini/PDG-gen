import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[][] coord = new int[n][2];
      for(int i = 0; i < n; i++) {
        coord[i][0] = sc.nextInt();
        coord[i][1] = sc.nextInt();
      }
      Map<String, Integer> cntMap = new HashMap<>();
      for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
          if(i == j) continue;
          long dx = (long)coord[j][0] - (long)coord[i][0];
          long dy = (long)coord[j][1] - (long)coord[i][1];
          String key = dx + "," + dy;
          //System.out.println(key);
          cntMap.put(key, cntMap.getOrDefault(key, 0) + 1);
        }
      }
      int max = 0;
      for(Integer cnt : cntMap.values()) {
        max = Math.max(max, cnt);
      }
      System.out.println(n - max);
  }
}