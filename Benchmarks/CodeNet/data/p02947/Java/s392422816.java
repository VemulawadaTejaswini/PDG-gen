import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] s = new String[n];
    int count = 0;

    for (int i = 0; i < n; ++i) {
      s[i] = sc.next();
    }

    for (int i = 0; i < n; ++i) {

      char[] si = s[i].toCharArray();
      Arrays.sort(si);

      for (int j = i + 1; j < n; ++j) {
        char[] sj = s[j].toCharArray();
        Arrays.sort(sj);
        if (Arrays.equals(si, sj))
          count ++;
      }
    }

    System.out.println(count);
  }
}