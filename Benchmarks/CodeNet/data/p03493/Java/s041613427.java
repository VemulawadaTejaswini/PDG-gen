import java.util.Scanner;
public class Main {
  int count = 0;
  public static void main(String[] args) {
    new Main().run();
  }
  void run() {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    for(int i = 0; i < 3; i++) {
      char c = s.charAt(i);
      if(c == '1') count++;
    }
    System.out.println(count);
  }
}
