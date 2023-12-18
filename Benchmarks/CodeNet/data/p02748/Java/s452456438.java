import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int m = sc.nextInt();
    List<Integer> as = new ArrayList<>();
    for (int i = 0; i < a; i++) {
      as.add(sc.nextInt());
    }
    List<Integer> bs = new ArrayList<>();
    for (int i = 0; i < b; i++) {
      bs.add(sc.nextInt());
    }

    long r = Long.MAX_VALUE;
    
    for (int i = 0; i < m; i++) {
      List<Integer> cs = new ArrayList<>();
      for (int j = 0; j < 3; j++) {
        cs.add(sc.nextInt());
      }
      int t = as.get(cs.get(0) - 1) + bs.get(cs.get(1) - 1) - cs.get(2);
      if (t < r) {
        r = t;
      }
    }
    
    as.sort(Comparator.naturalOrder());
    bs.sort(Comparator.naturalOrder());
    if (as.get(0) + bs.get(0) < r) {
      r = as.get(0) + bs.get(0);
    }

    sc.close();
    System.out.println(r);
  }
}
