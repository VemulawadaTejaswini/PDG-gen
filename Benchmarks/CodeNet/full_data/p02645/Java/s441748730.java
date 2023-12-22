import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.print(name.substring(0,3));
   
    scanner.close();

  }

}