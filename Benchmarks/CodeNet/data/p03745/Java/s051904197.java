import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = scanner.nextInt();
    int count = 1;
    for (int i = 2; i < N; i++) {
      if (A[i - 2] <= A[i - 1] && A[i - 1] <= A[i]) continue;
      if (A[i - 2] >= A[i - 1] && A[i - 1] >= A[i]) continue;
      count++;
      i++;
    }
    System.out.println(count);
  }
}
