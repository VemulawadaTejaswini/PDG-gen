public class Main {
  public static void main(String[] args) {
    String S = new java.util.Scanner(System.in).nextLine();
    if (S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
