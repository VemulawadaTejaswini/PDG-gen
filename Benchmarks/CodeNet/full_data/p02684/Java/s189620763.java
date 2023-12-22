import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> loop = new ArrayList<>();
    int next = 1;
    int st = 0;
    int loopLen;
    int res;
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
    for (int i = 0; i < n; i++) {
      next = list.get(next-1);
      if (loop.contains(next)) {
        st = loop.indexOf(next);
        break; 
      }
      loop.add(next);
    }
    loopLen = loop.size() - st;
    res = loop.get((int)(st+(k-st-1)%loopLen));
    System.out.println(res);
    sc.close();
  }
}