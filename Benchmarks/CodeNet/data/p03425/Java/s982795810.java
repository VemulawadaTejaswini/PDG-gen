import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<String, Long> map = new HashMap<>();
    String[] strings = {"M", "A", "R", "C", "H"};
    for(String s : strings) {
      map.put(s, 0L);
    }
    for(int i = 0; i < n; i++) {
      String key = sc.next().substring(0, 1);
      for(String s : strings) {
        if(s.equals(key)) {
          map.put(key, map.get(key) + 1L);
          break;
        }
      }
    }
    long count = 0;
    for(int i = 0; i < strings.length; i++) {
      for(int j = i + 1; j < strings.length; j++) {
        for(int k = j + 1; k < strings.length; k++) {
          count += map.get(strings[i]) * map.get(strings[j]) * map.get(strings[k]);
        }
      }
    }
    System.out.println(count);
  }
}