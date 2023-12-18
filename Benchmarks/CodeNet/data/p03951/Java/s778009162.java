import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String s = sc.next();
    String t = sc.next();
    int index = 200;
    for(int i = 0; i < N; i++) {
      String sub = s.substring(i);
      String sub2 = t.substring(0, N - i);
      if(sub.equals(sub2)) {
        index = i;
        break;
      }
    }
    if(index == 200) index = N;
    System.out.println(N + index);
  }
}