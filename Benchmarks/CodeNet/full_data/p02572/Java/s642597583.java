import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int length = s.nextInt();
    int[] numbers = new int[length];
    int sum = 0;
    int[] cumulativeSums = new int[length];
    for (int i = 0; i < length; i++) {
      numbers[i] = s.nextInt();
    }
    for (int i = numbers.length - 1; i > 0; i--) {
      sum += numbers[i];
      cumulativeSums[i - 1] = sum;
    }
    s.close();
    System.out.println(sumOfProduct(numbers, cumulativeSums));
  }

  private static Integer sumOfProduct(int[] numbers, int[] cumulativeSums) {
    int result = 0;
    for (int i = 0; i < numbers.length - 1; i++) {
      result += numbers[i] * cumulativeSums[i];
    }
    return (int) (result % (Math.pow(10, 9) + 7));
  }
}
