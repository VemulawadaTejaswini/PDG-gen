import java.util.Scanner;
public class Main {
  void run() {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char c = s.charAt(0);
    if(c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
      System.out.println("vowel");
    }else {
      System.out.println("consonant");
    }
  }
  public static void main(String[] args) {
    new Main().run();
  }
}
