import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    String S = sc.next();

    int step = 0, cur = S.length()-1;
    List<Integer> outList = new LinkedList<Integer>();
    while (step <= N) {
      if (cur <= M) {
        outList.add(cur);
        break;
      }
      for (int i = M; i >= 0; i--) {
        if (i == 0) {
          System.out.println("-1");
        }
        if (S.charAt(cur-i) != '1') {
          outList.add(i);
          cur -= i;
          break;
        }
      }
      step++;
    }
    if (step > N) System.out.println("-1");
    else {
      String out = new String(""+outList.get(outList.size()-1));
      for (int i = outList.size() - 2; i >= 0; i--) {
        out += new String(" " + outList.get(i));
      }
      System.out.println(out);
    }
  }
}
