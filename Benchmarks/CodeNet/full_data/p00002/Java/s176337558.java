import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    try {
      while (input.ready()) {
        String[] dataset = input.readLine().split(" ");
        int sum = Integer.valueOf(dataset[0]) + Integer.valueOf(dataset[1]);
        System.out.println(countDigitNumber(sum));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static int countDigitNumber(int number) {
    int digitNumber = 1;
    while (number >= 10) {
      digitNumber++;
      number = number / 10;
    }
    return digitNumber;
  }
}