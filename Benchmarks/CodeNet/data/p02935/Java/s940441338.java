import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] v = new int[N];

    for (int i = 0; i < N; i++) {
      v[i] = sc.nextInt();
    }

    sc.close();

    Arrays.sort(v);

    double max = ((double) v[0] + (double) v[1]) / 2;

    for (int i = 2; i < N; i++) {
      max = (max + (double) v[i]) / 2;
    }

    System.out.println(max);

  }

}