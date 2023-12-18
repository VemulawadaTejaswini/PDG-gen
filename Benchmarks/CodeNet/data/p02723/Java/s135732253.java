public class Main {
  public static void main(String[] args) {
    String S = new java.util.Scanner(System.in).nextLine();
    if (S.CharAt(2) == S.CharAt(3) && S.CharAt(4) == S.CharAt(5)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
