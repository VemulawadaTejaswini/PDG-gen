import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] sumArray = new int[100];
    int d;
    int count = 0;

    for (int i=0; i < N; i++) {
      d = sc.nextInt();
      sumArray[d] += 1;
    }

    for (int i=0; i < 100; i++) {
      if (sumArray[i] != 0) {
        count += 1;
      }
    }

    System.out.println(count);
  }
}
