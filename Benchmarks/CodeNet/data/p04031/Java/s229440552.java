import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = scanner.nextInt();
    if (count == 0) {
      System.out.println(0);
      return;
    }

    List<Integer> numbers = new ArrayList<>();
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int ix = 0; ix < count; ix++) {
      int value = scanner.nextInt();
      min = Math.min(min, value);
      max = Math.max(max, value);

      numbers.add(value);
    }

    int cost = 0;
    int mid = min + (max - min) / 2;
    for (int num : numbers) {
      int distance = Math.abs(num - mid);
      cost += (distance * distance);
    }

    System.out.println(cost);
  }
}

