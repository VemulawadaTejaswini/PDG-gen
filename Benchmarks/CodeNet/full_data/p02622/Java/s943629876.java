public class Main {
  public static void main(String[] args) {
    String S = new java.util.Scanner(System.in).nextLine();
    String T = new java.util.Scanner(System.in).nextLine();
    int counts = 0;
    for (int i = 0; i < S.length; i++) {
      if (S.charAt(i) != T.charAt(i)) {
        counts = counts + 1;
      }
    }
    System.out.println(counts);
  }
}
