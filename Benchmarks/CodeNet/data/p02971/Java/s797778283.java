import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();

    int max = 0;
    int max2 = 0;
    int tmp = 0;
    int[] array = new int[N];
    for (int i = 0; i < N; i++) {
      tmp = scan.nextInt();
      array[i] = tmp;
      if (max < tmp) {
        max = tmp;
      }
      if (max != tmp && max2 < tmp) {
        max2 = tmp;
      }
    }

    for (int i = 0; i < N; i++) {
      if (array[i] <= max) {
        System.out.println(max);
        continue;
      }
      System.out.println(max2);
    }
  }
}
