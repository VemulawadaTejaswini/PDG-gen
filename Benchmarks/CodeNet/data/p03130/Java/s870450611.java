import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int count[] = { 0, 0, 0, 0 };
    for (int i = 0; i < 6; i++) {
      int in = Integer.parseInt(sc.next());
      count[in - 1]++;
    }

    Arrays.sort(count);
    if (count[0] == 1 && count[1] == 1 && count[2] == 2 && count[3] == 2) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
}