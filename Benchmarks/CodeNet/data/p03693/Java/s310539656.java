import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Deque<Integer> list = new ArrayDeque<>(Arrays.asList(2,1,0));
    try (Scanner sc = new Scanner(System.in)) {   
      int sum = Stream.of(sc.nextLine().split(" "))
                      .map(Integer::valueOf)
                      .reduce(0, (x, y) -> x + y * (int) Math.pow(10,list.removeFirst()));
      System.out.println((sum % 4 == 0) ? "Yes" : "No");
    }
  }
}