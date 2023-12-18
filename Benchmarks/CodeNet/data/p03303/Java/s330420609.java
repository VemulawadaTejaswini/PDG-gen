import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    char[] S = sc.next().toCharArray();
    int W = sc.nextInt();
    for (int i = 0; i < S.length; i+=W) {
      System.out.print(S[i]);
    }
    System.out.println();
  }

}
