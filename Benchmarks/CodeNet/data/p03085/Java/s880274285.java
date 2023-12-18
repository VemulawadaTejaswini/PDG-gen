import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String b = scan.nextLine();
    switch (b) {
      case "A":
        System.out.println("T");
        return;
      case "T":
        System.out.println("A");
        return;
      case "C":
        System.out.println("G");
        return;
      case "G":
        System.out.println("C");
        return;
      default:
        return;
    }
  }
}