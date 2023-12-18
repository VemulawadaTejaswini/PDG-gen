import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] S = scanner.next().toCharArray();
    Arrays.sort(S);
    char ch = 'a';
    for (char s : S) if (ch == s) ch++;
    if (ch > 'z') System.out.println("None");
    else System.out.println(ch);
  }
}
