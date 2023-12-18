import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt() - 1;
    }
    int num = 0;
    for (int i = 0; i < N; i++) {
      if (a[a[i]] == i) num++;
    }
    System.out.println(num / 2);
  }
}
