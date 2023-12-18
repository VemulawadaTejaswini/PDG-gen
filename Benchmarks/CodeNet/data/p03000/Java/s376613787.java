import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int l[] = new int[n];
    int d = 0;
    int i = 1;
    for (int cnt = 0; cnt < n; cnt++) {
      l[cnt] = sc.nextInt();
      d += l[cnt];
      if (d <= x) {
        i++;
      }
    }
    System.out.println(i);
    sc.close();
  }
}