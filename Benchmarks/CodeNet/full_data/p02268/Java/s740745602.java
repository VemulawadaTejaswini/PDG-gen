import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> s = new ArrayList<>();
    for(int i = 0; i < n; i++) {
      s.add(sc.nextInt());
    }
    int q = sc.nextInt();
    List<Integer> t = new ArrayList<>();
    for(int i = 0; i < q; i++) {
      t.add(sc.nextInt());
    }
    int count = 0;
    for(int i = 0; i < q; i++) {
      int left = 0;
      int right = n - 1;
      int middle = (left + right) / 2;
      while(t.get(i).intValue() != s.get(middle).intValue()) {
        if(t.get(i) < s.get(middle)) {
          right = middle - 1;
        } else if(t.get(i) > s.get(middle)) {
          left = middle + 1;
        }
        if(right < left) {
          break;
        }
        middle = (left + right) / 2;
      }
      if(t.get(i).intValue() == s.get(middle).intValue()) {
        count++;
      }
    }
    System.out.println(count);
  }
}

