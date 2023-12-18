import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashSet<Integer> set = new HashSet<Integer>();
    for (int i = 0; i < 3; i++) {
      set.add(sc.nextInt());
    }
    if (set.size() == 2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    sc.close();
  }

}
