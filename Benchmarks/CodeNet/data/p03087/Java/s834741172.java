import java.util.Scanner;

public class Main {
  private static final String AC = "AC";

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);) {
      int n = sc.nextInt();
      int q = sc.nextInt();

      sc.nextLine();

      String line = sc.nextLine();

      int[] ans = new int[q];
      for (int i = 0; i < q; i++) {

        int l = sc.nextInt();
        int r = sc.nextInt();
        sc.nextLine();

        ans[i] = get(line.substring(l - 1, r));
      }

      for (int i = 0; i < ans.length; i++) {
        System.out.println(ans[i]);
      }
    }
  }

  private static int get(String target) {
    int len = AC.length();
    int count = 0;
    int s = 0;
    while (target.indexOf(AC, s) != -1) {
      s = target.indexOf(AC, s) + len;
      count++;
    }
    return count;
  }
}