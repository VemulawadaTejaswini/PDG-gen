import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> l = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      int t = sc.nextInt();
      l.add(t);
    }
    
    Collections.sort(l);
    Collections.reverse(l);
    for (int i = 0; i < 3; i++) {
      System.out.println(l.get(i));
    }
  }
};