import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String w = sc.nextLine();

    int count = 0;

    while (true) {
        String[] t = sc.nextLine().split(" ");

        if (t.length > 0 && "END_OF_TEXT".equals(t[0])) break;

        for (String s : t) {
            count += s.toLowerCase().equals(w) ? 1 : 0;
        }
    }

    System.out.println(count);
  }
}
