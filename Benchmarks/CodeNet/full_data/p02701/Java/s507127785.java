import java.util.*;

public class atcoder_163_3 {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();

    Set<String> words = new HashSet<>();

    for (int i = 0; i < n; i++) {
      words.add(scan.next());
    }


    System.out.println(words.size());
  }
}
