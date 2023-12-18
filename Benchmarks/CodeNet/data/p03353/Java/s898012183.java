import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String s_ = sc.next();
    String[] s = s_.split("");
    int K = sc.nextInt();
    sc.close();

    String result = "";
    SortedSet<String> tree = new TreeSet<>();
    int count = 0;

    for (int i = 0; i < s.length; i++) {
      result = "";
      count = 0;
      for (int j = i; j < s.length; j++) {
        result += s[j];
        tree.add(result);
        count++;
        if (K < count) {
          break;
        }
      }
    }

    String[] arr = tree.toArray(new String[tree.size()]);

    System.out.println(arr[K-1]);

  }

}