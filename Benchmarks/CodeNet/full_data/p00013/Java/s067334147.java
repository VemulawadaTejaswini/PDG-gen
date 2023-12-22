import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    Deque<Integer> trainStack = new ArrayDeque<>();

    while (input.ready()) {
      int num = Integer.parseInt(input.readLine());
      if (num == 0) {
        System.out.println(trainStack.poll());
      } else {
        trainStack.push(num);
      }
    }
  }
}