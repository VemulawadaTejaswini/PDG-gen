import java.util.*;
import java.util.Map.*;

public class Main {

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    Map<String, Integer> nMap = new HashMap<String, Integer>();
    putMap(scan, n, nMap);
    int m = scan.nextInt();
    Map<String, Integer> mMap = new HashMap<String, Integer>();
    putMap(scan, m, mMap);
    
    int result = 0;
    for (Entry<String, Integer> entry : nMap.entrySet()) {
      String key = entry.getKey();
      int value = entry.getValue();      
      if (mMap.containsKey(key)) {
        value -= mMap.get(key);
      }
      if (value > result) {
        result = value;
      }
    }
    System.out.println(result);
  }

  private void putMap(Scanner scan, int count, Map<String, Integer> map) {
    for (int i = 0; i < count; i++) {
      String key = scan.next();
      if (map.containsKey(key)) {
        map.put(key, map.get(key) + 1);
      } else {
        map.put(key, 1);
      }
    }
  }
}