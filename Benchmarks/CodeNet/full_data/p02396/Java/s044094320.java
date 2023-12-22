import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("入力してください。");
      int count = 1;
      while(input.hasNext()) {
        int value = Integer.valueOf(input.next());
        if(value == 0) {
          break;
        }
        System.out.println("Case " + count + ": " + value);
        count++;
      }
    }
}
