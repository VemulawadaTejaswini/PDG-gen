import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    sc.nextLine();
    String[] ss = new String[n];
    for (int i = 0; i < n; ++i) {
      ss[i] = sc.nextLine();
    }

    Arrays.sort(ss);

    StringBuilder sb = new StringBuilder();
    for (String s : ss) {
      sb.append(s);
    }

    System.out.println(sb.toString());
  }
}
