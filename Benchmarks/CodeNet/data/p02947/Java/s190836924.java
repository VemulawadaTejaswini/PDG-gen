import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    Map<String, List<String>> smap = new HashMap<>();

    for (int i = 0; i < N; i++) {
      String s = sc.next();
      char[] c = s.toCharArray();
      Arrays.sort(c);
      String key = new String(c);
      if (smap.get(key) == null) smap.put(key, new ArrayList<>());
      smap.get(key).add(s);
    }

    long count = 0L;
    for (Map.Entry<String, List<String>> entry : smap.entrySet()) {
      int arrSize = entry.getValue().size();
      if (arrSize == 2) count += 1;
      if (arrSize >= 3) count += arrSize;
    }

    System.out.println(count);
  }
}