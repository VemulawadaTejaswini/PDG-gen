import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    LinkedList<Long> list = new LinkedList<>();
    for (long i = 1; i < 10; i++) {
      dfs(1,i,list);
    }
    Collections.sort(list);
    System.out.println(list.get(k-1));
  }

  public static void dfs (int d, long val, LinkedList<Long> list) {
    list.addLast(val);
    if (d == 3) return;
    for (int i = -1; i <= 1; i++) {
      long add = (val % 10) + i;
      if (add >= 0 && add <= 9) dfs(d++, val*10+add,list);
    }
  }

}
