import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N[] = new int[3];
    for (int i = 0; i < 3; i++) {
      N[i] = scanner.nextInt();
    }
    int ac = Math.abs(N[0]-N[2]);
    int d = scanner.nextInt();
    Arrays.sort(N);
    if ( N[2] - N[0] <= d*2 || ac <= d) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}