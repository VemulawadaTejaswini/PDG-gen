import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N + 1];
    for (int i = 0; i < N; i++) {
      int tmp = sc.nextInt();
      A[tmp]++;
    }
    ArrayList<Integer> number = new ArrayList<>();
    int count = 0;
    for (int i = 1; i <= N; i++) {
      if (A[i] >= 2) {
        number.add(i);
        count++;
      }
    }
    if (count < 2) {
      System.out.println(0);
      return;
    }
    long a1 = number.get(number.size() - 1);
    long a2 = number.get(number.size() - 2);
    System.out.println(a1 * a2);
  }
}