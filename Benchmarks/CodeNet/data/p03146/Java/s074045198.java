import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    Set<Integer> set = new HashSet<>();
    
    // i = 1
    int prev = s;
    set.add(s);

    int i = 2;
    while (true) {
      int v = prev%2 == 0 ? prev/2 : 3*prev+1;
      if (set.contains(v)) {
        System.out.println(i);
        return;
      }
      set.add(v);
      prev = v;
      i++;
    }
  }
}