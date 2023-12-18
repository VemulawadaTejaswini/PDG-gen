import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    final Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    System.out.println(input);

    int length = input.length();

    String answer1 = "";
    for (int i = 0; i < length; i++) {
      if (i % 2 == 0) {
        answer1 += "1";
      } else {
        answer1 += "0";
      }
    }
    int count1 = 0;
    for (int j = 0; j < length; j ++) {
      if (input.charAt(j) != answer1.charAt(j)) {
        count1++;
      }
    }

    String answer2 = "";
    for (int i = 0; i < length; i++) {
      if (i % 2 == 0) {
        answer2 += "0";
      } else {
        answer2 += "1";
      }
    }
    int count2 = 0;
    for (int j = 0; j < length; j ++) {
      if (input.charAt(j) != answer2.charAt(j)) {
        count2++;
      }
    }

    System.out.println(Math.min(count1, count2));
  }
}