import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    boolean isEqual = false;
    if (input < 4 || input > 100) {
      isEqual = false;
    } else if (input % 4 == 0 || input % 4 == 3 || input % 7 == 0 || input % 7 == 4) {
      isEqual = true;
    } else {
      // 4 base
      int inputCopy = input;
      while (inputCopy > 0) {
        if (inputCopy % 7 != 0) {inputCopy -= 4;} else {isEqual = true;}
      }
      // 7 base
      inputCopy = input;
      while (input > 0) {
        if (inputCopy % 4 != 0) {inputCopy -= 7;} else {isEqual = true;}
      }
    }
    System.out.println(isEqual ? "Yes" : "No");
  }
}