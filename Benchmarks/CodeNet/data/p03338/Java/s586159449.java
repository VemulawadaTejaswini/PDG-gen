import java.util.*;

public class Main {

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String s = scan.next();
    int max = 0;
    for (int i = 1; i < s.length() - 1; i++) {
      Set<String> x = createSet(s.substring(0, i));
      Set<String> y = createSet(s.substring(i));
      int count = 0;
      for (String value : x) {
        if (y.contains(value)) {
          count++;
        }
      }
      if (count > max) {
        max = count;
      }
    }
    System.out.println(max);
  }

  private Set<String> createSet(String value) {
    Set<String> charSet = new HashSet<String>();
    for (int i = 0; i < value.length(); i++) {
      charSet.add(value.substring(i, i + 1));
    }
    return charSet;
  }
}