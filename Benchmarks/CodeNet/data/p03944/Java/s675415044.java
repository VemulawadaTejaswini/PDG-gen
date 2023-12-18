import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int n = sc.nextInt();
    int maxX = w;
    int minX = 0;
    int maxY = h;
    int minY = 0;
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int a = sc.nextInt();
      if (a == 1 && x > minX) {
        minX = x;
      } else if (a == 2 && x < maxX) {
        maxX = x;
      } else if (a == 3 && y > minY) {
        minY = y;
      } else if (a == 4 && y < maxY) {
        maxY = y;
      }
    }
    sc.close();

    int result = (maxX - minX) * (maxY - minY);
    if (minX > maxX || maxY < minY) {
      result = 0;
    }
    System.out.println(result);
  }
}
