import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[][] coords = new long[n][2];
      for(int i = 0; i < n; i++) {
        coords[i][0] = sc.nextInt();
        coords[i][1] = sc.nextInt();
      }
      Arrays.sort(coords, (c1, c2) -> c1[0] == c2[0] ? (int)(c1[1] - c2[1]) : (int)(c1[0] - c2[0]));
      Map<String, Integer> freqMap = new HashMap<>();
      for(int i = 0; i < n; i++) {
          for(int j = i + 1; j < n; j++) {
            long dx = coords[i][0] - coords[j][0];
            long dy = coords[i][1] - coords[j][1];
            String key = dx + "," + dy;
            freqMap.put(key, freqMap.getOrDefault(key, 0) + 1);
          }
      }

      int max = 0;
      for(Integer freq : freqMap.values())
        max = Math.max(freq, max);
      System.out.println(n - max);
  }
}