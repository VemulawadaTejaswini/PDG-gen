import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    ArrayList<Integer> A = new ArrayList<Integer>();

    for (int i = 0; i < N; i++) {
      A.add(sc.nextInt());
    }

    sc.close();

    while (0 < M) {
      int max = Collections.max(A);
      int minIndex = A.indexOf(max);
      max = max / 2;
      A.set(minIndex, max);
      M--;
    }

    long sum = 0;

    for (int i = 0; i < N; i++) {
      sum += A.get(i);
    }

    System.out.println(sum);

  }

}