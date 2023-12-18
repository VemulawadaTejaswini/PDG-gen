import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int TOP_LEN = Integer.parseInt(scanner.next());
    int BOTTOM_LEN = Integer.parseInt(scanner.next());
    int HEIGHT = Integer.parseInt(scanner.next());
    scanner.close();

    System.out.println((TOP_LEN+BOTTOM_LEN)*HEIGHT/2);
  }
}
