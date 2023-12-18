import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] a = new int[N];

    int sum = 0;

    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      sum += a[i];
    }

    sc.close();

    int average = (int) Math.ceil((double) sum / N);

    int cost = 0;

    for (int i = 0; i < N; i++) {
      int dif = (int) Math.abs(a[i] - average); 
      cost += dif * dif;
    }

    System.out.println(cost);

  }

}