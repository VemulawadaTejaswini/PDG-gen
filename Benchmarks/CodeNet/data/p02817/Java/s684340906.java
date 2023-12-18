import java.util.Scanner;

public class Sample {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);


    String input_text = scanner.nextLine();
    String input_text2 = scanner2.nextLine();

    System.out.println(input_text.concat(input_text2));

    scanner.close();

  }

}