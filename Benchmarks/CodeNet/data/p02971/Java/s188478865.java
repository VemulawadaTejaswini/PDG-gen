import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    int max = Arrays.stream(A).max().getAsInt();
    OptionalInt nextMax = Arrays.stream(A).filter(e -> e != max).max();
    for (int i = 0; i < N; i++) {
      if (A[i] == max && nextMax.isPresent()) {
        System.out.println(nextMax.getAsInt());
      } else {
        System.out.println(max);
      }
    }
  }
}