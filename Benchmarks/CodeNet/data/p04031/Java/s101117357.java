import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = scanner.nextInt();
    List<Integer> numbers = new ArrayList<>();
    long sum = 0;
    for (int ix = 0; ix < count; ix++) {
      int value = scanner.nextInt();
      sum += value;
      numbers.add(value);
    }

    int cost = 0;
    int average = (int)sum / numbers.size();
    for (int num : numbers) {
      int distance = Math.abs(num - average);
      cost += (distance * distance);
    }

    System.out.println(cost);
  }
}
