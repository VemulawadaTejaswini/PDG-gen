
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Set<String> hash_set = new HashSet<String>();
    for (int i = 0; i < n; i++) {
      hash_set.add(sc.next());
    }
    System.out.println(hash_set.size());
    sc.close();
  }
}