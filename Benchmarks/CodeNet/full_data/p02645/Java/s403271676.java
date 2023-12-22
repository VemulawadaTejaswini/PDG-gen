import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String input_text = scanner.nextLine();

    System.out.println(input_text.subSequence(0, 3));

    scanner.close();

  }
}