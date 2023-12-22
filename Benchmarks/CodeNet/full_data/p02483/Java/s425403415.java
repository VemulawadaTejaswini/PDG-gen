import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] numbers = new int[3];
    for (int i = 0; i < 3; i++) {
      numbers[i] = in.nextInt();
    }

    Arrays.sort(numbers);

    StringBuilder builder = new StringBuilder();
    for (int i = 0, length = numbers.length; i < length; i++) {
      builder.append(numbers[i]);
      if (i < length - 1) {
        builder.append(' ');
      }
    }
    System.out.println(builder.toString());
  }
}