import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();

    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      int v = 1;
      if (map.containsKey(a)) {
        v = map.get(a);
        v++;
      }
      map.put(a,v);
    }

    sc.close();

    int count = 0;

    for (Map.Entry<Integer, Integer> map_ : map.entrySet()) {
      if (map_.getKey() != map_.getValue()) {
        if (map_.getKey() < map_.getValue()) {
          count += map_.getValue() - map_.getKey();
        } else {
          count += map_.getValue();
        }
      }
    }

    System.out.println(count);

  }

}