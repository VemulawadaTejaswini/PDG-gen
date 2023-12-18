import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> list = new ArrayList<Integer>();
    while (true) {
      if (N % (-2) == -1) {
        list.add(1);
        N = N / (-2) + 1;
      } else {
        list.add(N % (-2));
      	N = N / (-2);
      }
     
      if (N == 0) {
        break;
      }
    }
    for (int i = list.size() - 1; i >= 0; i--) {
      System.out.print(list.get(i));
    }
  }
}
