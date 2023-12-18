
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder s = new StringBuilder(scanner.next());
    int q = scanner.nextInt();
    int before = -1;
    int next = -1;

    for (int i = 0; i < q; i++) {
      int query;
      if(next == -1) {
        query = scanner.nextInt();
      } else {
        query = next;
      }
      if (query == 1) {
        if(scanner.hasNext()) {
          next = scanner.nextInt();
          i++;
        }
        if(next != 1) {
          s.reverse();
        }
      } else {
        next = -1;
        int f = scanner.nextInt();
        String c = scanner.next();
        if (f == 1) {
          s.insert(0, c);
        } else {
          s.append(c);
        }
      }
    }
    System.out.println(s);
  }
}
