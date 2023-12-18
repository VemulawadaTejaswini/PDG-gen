import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    AnsCounter counter = new AnsCounter();
    IntStream.range(0, n).mapToObj(i -> sc.next())
      .forEach(s -> counter.add(Integer.valueOf(s)));
    pw.println(counter.count);
  }

  private static class AnsCounter {

    int count = 0;
    LinkedList<Integer> numbers = new LinkedList<>();

    void add(Integer n) {
      if (numbers.size() == 3) {
        numbers.poll();
      }
      numbers.add(n);
      if (numbers.size() == 3) {
        int elem1 = numbers.get(0);
        int elem2 = numbers.get(1);
        int elem3 = numbers.get(2);
        if (elem1 <= elem2 && elem2 < elem3) {
          count++;
        }
        if (elem3 <= elem2 && elem2 < elem1) {
          count++;
        }
      }
    }
  }
}
