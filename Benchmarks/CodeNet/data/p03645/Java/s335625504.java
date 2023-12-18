import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] a = new int[M];
    int[] b = new int[M];

    HashMap<Integer, Set<Integer>> hashMap = new HashMap<>();

    for (int i = 0; i < M; i++) {
      int a_ = sc.nextInt();
      int b_ = sc.nextInt();
      Set<Integer> set_;
      if (hashMap.containsKey(a_)){
        set_ = hashMap.get(a_);
      } else {
        set_ = new HashSet<Integer>();
      }
      set_.add(b_);
      hashMap.put(a_, set_);
    }

    sc.close();
    
    String result = "IMPOSSIBLE";

    Set<Integer> set = hashMap.get(1);

    for(Integer value : set) {
      if (hashMap.containsKey(value)){
        Set<Integer> set_ = hashMap.get(value);
        for(Integer value_ : set_) {
          if (value_ == N) {
            result = "POSSIBLE";
            break;
          }
        }
      }
      if (result.equals("POSSIBLE")) {
        break;
      }
    }

    System.out.println(result);

  }

}
