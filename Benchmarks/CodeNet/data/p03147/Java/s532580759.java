import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] h = new int[N];

    for (int i = 0; i < N; i++) {
      h[i] = sc.nextInt();
    }

    sc.close();

    int count = 0;
    int number = 0;

    for (int i = 0; i < N; i++) {
      if (number > h[i]) {
        count += number - h[i];
      }
      number = h[i];
    }

    count += number;

    System.out.println(count);

  }

}