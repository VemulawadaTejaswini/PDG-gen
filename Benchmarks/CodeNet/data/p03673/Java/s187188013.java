import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  List<Integer> a = new ArrayList<>();
  for (int i = 0; i < n; i++) {
    a.add(sc.nextInt());
  }
  List<Integer> b = new LinkedList<>();
  for (int i = 0; i < a.size(); i++) {
    b.add(a.get(i));
    Collections.reverse(b);

  }
  for (int i = 0; i < b.size(); i++) {
    System.out.print(b.get(i));
    System.out.print(" ");
  }
  }
}
