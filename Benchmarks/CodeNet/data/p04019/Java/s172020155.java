import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[] s = in.next().toCharArray();
    boolean S = false, W = false, N = false, E = false;
    for (char c : s) {
      if (c == 'S') S = true;
      if (c == 'E') E = true;
      if (c == 'W') W = true;
      if (c == 'N') N = true;
    }
    if (N == S && W == E) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    in.close();
  }
}