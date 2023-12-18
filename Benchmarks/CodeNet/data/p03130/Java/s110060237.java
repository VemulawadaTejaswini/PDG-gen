import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] path = new int[6];
    for (int i = 0; i < 6; i++) {
      path[i] = scanner.nextInt();
    }
    int[] count = new int[4];
    for (int i = 0; i < 4; i++) {
      count[i] = 0;
    }
    int odd = 0;
    for (int i = 0; i < 6; i++) {
      count[path[i] - 1]++;
    }
    for (int i = 0; i < 4; i++) {
      if (count[i] % 2 != 0)
        odd++;
    }
    String ans = odd == 0 || odd == 2 ? "YES" : "NO";
    System.out.println(ans);
  }

}
