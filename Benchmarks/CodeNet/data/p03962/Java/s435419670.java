import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    while (sc.hasNext()) {
      list.add(sc.nextInt());
    }
    List<Integer> listB = new ArrayList<Integer>(new HashSet<>(list));
    System.out.println(listB.size());
  }
}