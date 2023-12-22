import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

  public static void main(String[] args) {

    new Main().run();
  }

  public void run() {

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      Integer n;
      String line;
      Deque<Integer> que = new ArrayDeque<>(100);
      while (true) {
        line = br.readLine();
        if ((line == null) || line.isEmpty())
          break;

        n = new Integer( Integer.parseInt(line) );

        if (n != 0)
          que.add(n);
        else
          System.out.println(que.pollLast());
      }
    } catch (IOException e) {
      System.err.println(e);
    }
  }
}
