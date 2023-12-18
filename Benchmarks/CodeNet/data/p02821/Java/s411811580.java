import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long M = sc.nextLong();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = sc.nextInt();
    sc.close();

    Arrays.sort(A);
    List<Integer> list = new LinkedList<>();
    for (int i = N - 1; -1 < i; i--) {
      for (int j = N - 1; -1 < j; j--) {
        list.add(A[i] + A[j]);
      }
    }

    Collections.sort(list);

    long ans = 0;
    for (long m = 0; m < M; m++)
      ans += list.remove(list.size() - 1);
    System.out.println(ans);
  }
}