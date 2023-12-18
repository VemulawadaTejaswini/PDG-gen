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

    for (int i = 0; i < s.length; i++) {
      result = "";
      for (int j = i; j < s.length; j++) {
        result += s[j];
        tree.add(result);
      }
    }

    String[] arr = tree.toArray(new String[tree.size()]);

    System.out.println(arr[K-1]);

  }

}