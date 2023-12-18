import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      Map<Integer, List<Integer>> map = new HashMap<>();
      for(int i = 0; i < m; i++) {
        int k = sc.nextInt();
        List<Integer> sList = new ArrayList<>();
        for(int j = 0; j < k; j++) {
          sList.add(sc.nextInt() - 1);
        }
        map.put(i, sList);
      }
      int[] p = new int[m];
      for(int i = 0; i < m; i++)
        p[i] = sc.nextInt();

      int cnt = 0;
      for(int i = 0; i < (1<<n); i++) {
        int num = i;
        if(check(map, p, num))
          cnt++;
      }
      System.out.println(cnt);
  }

  private static boolean check(Map<Integer, List<Integer>> map, int[] pArr, int n) {
    for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
        int p = pArr[entry.getKey()];
        List<Integer> lights = entry.getValue();
        int cnt = 0;
        for(int lightIdx : lights) {
          if(((n >> lightIdx) & 1) == 1)
            cnt++;
        }
        if(cnt % 2 != p)
          return false;
    }
    return true;
  }
}