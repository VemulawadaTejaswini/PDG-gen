import java.util.Scanner;

public class Main {

  private static int n, input_number, min, max, sum;

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    n = stdIn.nextInt();
    min = 10000;
    max = -10000;
    sum = 0;

    for (int i = 0;i < n;i++) {
      input_number = stdIn.nextInt();
      if (min > input_number) {
        min = input_number;
      }
      if (max < input_number) {
        max = input_number;
      }
      sum += input_number;
    }

    System.out.println(min + " " + max + " " + sum);

  }
}