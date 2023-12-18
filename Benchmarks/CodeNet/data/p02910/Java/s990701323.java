import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    char[] cs = s.toCharArray();

    List<Character> rud = Arrays.asList('R', 'U', 'D');
    List<Character> lud = Arrays.asList('L', 'U', 'D');

    boolean isEasy = true;
    for (int i = 0; i < cs.length; i++) {
        if ((i % 2 == 0 && !rud.contains(cs[i]))
            ||
            (i % 2 != 0 && !lud.contains(cs[i]))) {
            isEasy = false;
            break;
        };
    }

    System.out.println(isEasy ? "Yes" : "No");
  }
}