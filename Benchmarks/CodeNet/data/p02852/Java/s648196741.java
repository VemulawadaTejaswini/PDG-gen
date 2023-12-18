import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    String S = sc.next();

    int step = 0, cur = N;
    List<Integer> outList = new LinkedList<Integer>();
    while (true) {
      if (cur <= M) {
        outList.add(cur);
        String out = new String(""+outList.get(outList.size()-1));
        for (int i = outList.size() - 2; i >= 0; i--) {
          out += new String(" " + outList.get(i));
        }
        System.out.println(out);
        return;
      }

      for (int i = M; i >= 0; i--) {
        if (i == 0) {
          System.out.println("-1");
          return;
        }
        if (S.charAt(cur-i) != '1') {
          outList.add(i);
          cur -= i;
          break;
        }
      }
    }
  }
}