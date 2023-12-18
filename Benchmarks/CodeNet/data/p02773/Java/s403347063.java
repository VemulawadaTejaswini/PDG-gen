import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    HashMap<String, Integer> h = new HashMap<String, Integer>();
    for (int i = 0; i < N; i++) {
      String s = sc.next();
      h.put(s, h.getOrDefault(s, 0)+1);
    }

    LinkedHashMap<String, Integer> rh = new LinkedHashMap<>();

    h.entrySet()
     .stream()
     .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
     .forEachOrdered(x -> rh.put(x.getKey(), x.getValue()));
    
    int maxCount = -1;
    for (Map.Entry<String, Integer> e : rh.entrySet()) {
      if (maxCount == -1) {
        maxCount = e.getValue();
      } else {
        if (maxCount != e.getValue()) {
          break;
        }
      }
      System.out.println(e.getKey());
    }
  }
}