import java.io.*;

public class Main {

  private static int n, min, max, number;
  private static long sum;

  public static void main(String[] args) throws NumberFormatException, IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    String[] input_numbers = br.readLine().split(" ");
    min = Integer.parseInt(input_numbers[0]);
    max = Integer.parseInt(input_numbers[0]);
    sum = 0;

    for (String input_number : input_numbers) {
      number = Integer.parseInt(input_number);
      if (min > number) {
        min = number;
      }
      if (max < number) {
        max = number;
      }
      sum += number;
    }

    System.out.println(min + " " + max + " " + sum);

  }
}