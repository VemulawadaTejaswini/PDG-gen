
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    int count = 0;
    int key = 471;

    for (int i = 0; i < s.length(); i++) {
      int prev = 0;
      int digSum = Character.getNumericValue(s.charAt(i));
      for (int j = i + 1; j < s.length(); j++) {
        int digNum = Character.getNumericValue(s.charAt(j));
        int pdigNum = Character.getNumericValue(s.charAt(j-1));
        digSum += digNum;
        prev = (prev*10 + pdigNum) % 673;
        if ((prev - digNum * key) % 673 == 0 && digSum % 3 == 0 && j - i >= 4) {
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
