import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int in_num = 1;

    while(stdIn.nextInt() == 0) {
      if (stdIn.nextInt() == 0) {
        break;
      } else {
        System.out.println("Case "+ in_num + ": " + stdIn.nextInt());
      }
      in_num++;
    }
  }
}