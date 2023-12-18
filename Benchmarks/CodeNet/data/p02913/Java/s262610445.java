import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();

    Map<String, List<Integer>> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
        for (int j = i; j < N; j++) {
            String sub = S.substring(i, j+1);
            List<Integer> list = map.get(sub);
            if (list == null) {
                list = new ArrayList<>();
                map.put(sub, list);
            }
            list.add(i);
        }
    }

    int ans = 0;
    for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
        String sub = entry.getKey();
        List<Integer> list = entry.getValue();
        if (list.size() >= 2) {
            int idx = list.get(0);
            int upper = idx + sub.length();
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) >= upper) {
                    ans = Math.max(ans, sub.length());
                }
            }
        }
    }
   
    System.out.println(ans);
  }
}
