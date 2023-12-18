import java.util.*;

public class Main {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int s = scan.nextInt();
    int w = scan.nextInt();

    System.out.println(s > w ? "safe" : "unsafe");
  }
}
