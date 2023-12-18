import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] O = scanner.next().toCharArray();
    char[] E = scanner.next().toCharArray();
    int i = 0;
    int j = 0;
    while (i < O.length || j < E.length) {
      if (i < O.length) System.out.print(O[i++]);
      if (j < E.length) System.out.print(E[j++]);
    }
    System.out.println();
  }
}
