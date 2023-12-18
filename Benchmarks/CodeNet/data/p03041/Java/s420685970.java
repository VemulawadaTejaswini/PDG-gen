import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int K = in.nextInt() - 1;
      char[] S = in.next().toCharArray();

      S[K] = Character.toLowerCase(S[K]);

      System.out.println(S);
    }
  }
}