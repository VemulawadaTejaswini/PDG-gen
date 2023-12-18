import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    String input_text = scanner.nextLine();
    input_text = input_text.replaceAll(" ", "");

    System.out.println(input_text);

    scanner.close();

  }

}