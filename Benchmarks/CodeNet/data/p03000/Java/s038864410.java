import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    while (sc.hasNext()) {
      list.add(sc.nextInt());
    }
    int cnt = count(list, X);
            
    System.out.println(cnt);
  }
  
  private static int count(List<Integer> list, int X) {
    int D = 0;
    int cnt = 0;
    for (Integer L : list) {
      D += L;
      cnt++;
      if (D > X) { return cnt; }
    }
    return cnt;
  }
}
      