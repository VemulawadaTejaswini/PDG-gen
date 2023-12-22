import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("入力してください。");
    Scanner input = new Scanner(System.in);
    int count = 1;
    String value;
    while(true) {
      value = input.nextLine();
      if(value.equals("0")) {
        break;
      }
      System.out.println("Case " + count + ": " + value);
      count++;
    }
  }
}
