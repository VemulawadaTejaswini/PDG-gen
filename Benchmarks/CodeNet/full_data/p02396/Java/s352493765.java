import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("入力してください。");
    Scanner input = new Scanner(System.in);
    int count = 1;
    while(input.hasNextInt()) {
      int value = Integer.valueOf(input.next());
      if(value == 0) {
        break;
      }
      System.out.println("Case " + count + ": " + value);
      count++;
     }
  }
}
