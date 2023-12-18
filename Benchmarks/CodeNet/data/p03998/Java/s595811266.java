import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Queue<Character>[] queues = new Queue[3];
    for (int i = 0; i < 3; i++) {
      queues[i] = new LinkedList<>();
      for (char ch : scanner.next().toCharArray()) queues[i].add(ch);
    }

    int c = 0;
    while (true) {
      if (queues[c].isEmpty()) {
        System.out.println((char)('A' + c));
        return;
      }
      char ch = queues[c].remove();
      c = ch - 'a';
    }
  }
}
