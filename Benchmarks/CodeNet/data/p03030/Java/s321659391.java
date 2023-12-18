import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    Map<String, Integer> map = new TreeMap<String, Integer>();
    for (int i = 0; i < num; i++) {
      String[] tmp = br.readLine().split(" ");
      String point = String.valueOf(100 - Integer.parseInt(tmp[1]));
      if (map.containsKey(tmp[0] + point)) {
        map.put(tmp[0] + point + "1", i + 1);
      } else {
        map.put(tmp[0] + point, i + 1);
      }
    }
    for (String key : map.keySet()) {
      System.out.println(map.get(key));
    }
  }
}