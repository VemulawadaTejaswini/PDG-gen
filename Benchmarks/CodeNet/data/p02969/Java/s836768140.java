import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = Integer.parseInt(sc.nextLine());
    System.out.println(3 * r * r);
    sc.close();
  }
}