import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int x = scan.nextInt();
    int[] l = new int[n];
    int[] d = new int[n];
    d[0] = 0;

    for (int i = 0; i < n ; i++) {
      l[i] = scan.nextInt();
    }

    for (int i = 1; i < n ; i++) {
      d[i] = d[i - 1] + l[i - 1];
    }
    int num = 0;

    for (int i = 0; i < n ; i++) {
      if (d[i] > x) {
        System.out.println(String.valueOf(num));
        break;
      }
      num++;
    }
    System.out.println(String.valueOf(num));
  }
}
