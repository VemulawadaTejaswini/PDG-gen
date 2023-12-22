import java.util.Scanner;
import java.util.*;
class Main {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    if (K >= 1 && K <= Math.pow(10,6)) {
      int c = 7%K;
      Set<Integer> a = new HashSet<Integer>();
      int i = 1;
      while (!a.contains(c)) {
        if (c == 0) {
          break;
        }
        a.add(c);
        c = (c*10+7)%K;
        ++i;
      }
      if (c != 0) {
        System.out.println("-1");
      } else {
        System.out.println(i);
      }
    }
  }
}