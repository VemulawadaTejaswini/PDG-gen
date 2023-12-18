import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    if (str.contains("7")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}