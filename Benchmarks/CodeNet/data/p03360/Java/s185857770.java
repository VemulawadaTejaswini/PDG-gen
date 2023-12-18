import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    //Split by '' and Convert String Array to Int Array
    int[] TARGET_NUMBERS = Stream.of(line.split(" ")).mapToInt(Integer::parseInt).toArray();
    int total = 0;

    line = sc.nextLine();
    //Split by '' and Convert String Array to Int Array
    int[] inputArray = Stream.of(line.split(" ")).mapToInt(Integer::parseInt).toArray();
    int numberOfTimes = inputArray[0];

    int max = 0;

    for (int i = 0; i< TARGET_NUMBERS.length;i++){
      max = Math.max(max, TARGET_NUMBERS[i]);
    }
    int power = (int)Math.pow(max, numberOfTimes);

    total = TARGET_NUMBERS[0] + TARGET_NUMBERS[1] + TARGET_NUMBERS[2] + power - max;

    System.out.print(total);

  }
}