import java.util.*;

public class Main {

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
	
    if (c >= a + b) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}