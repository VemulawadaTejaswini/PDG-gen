import java.util.Scanner;

public class Main {
    
  public static void main(String[] args) {
    String s;
    Scanner scanner = new Scanner(System.in);
    s = scanner.nextLine();
    for (int i = 0; i < 12; i++) {
        if (i == 4) {
            System.out.print(" ");
        }
        System.out.print(s.charAt(i));
    }
    scanner.close();

    System.out.println();
  }
}