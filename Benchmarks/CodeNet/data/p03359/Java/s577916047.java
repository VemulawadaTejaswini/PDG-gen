import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    //Split by '' and Convert String Array to Int Array
    int[] inputArray = Stream.of(line.split(" ")).mapToInt(Integer::parseInt).toArray();
    final int MONTH = inputArray[0];
    final int DAY = inputArray[1];
    int countTakahashi = 0;

    if (DAY >= MONTH){
      countTakahashi = MONTH;
    } else if (DAY < MONTH){
      countTakahashi = MONTH - 1;
    }

    System.out.print(countTakahashi);

  }
}