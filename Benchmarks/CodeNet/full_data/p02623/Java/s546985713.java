import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();
    sc.nextLine();
    int[] A = Arrays.stream(sc.nextLine().split(" "))
      .mapToInt(Integer::parseInt).toArray();
    int[] B = Arrays.stream(sc.nextLine().split(" "))
      .mapToInt(Integer::parseInt).toArray();
    long ans = 0;
    long a = 0;
    long bMax = 0;
    for (int i = 0; i < M; i++) bMax += B[i];
    for (int i = 0; i <= N; i++) {
      a += i == 0 ? 0 : A[i-1];
      if (a > K) break;
      for (int j = M-1; j >= 0; j--) {
        if (a + bMax > K) {
          M--;
          bMax -= B[j];
        } else {
          ans = Math.max(ans, i+j+1);
          break;
        }
      }
    }
    System.out.println(ans);
  }
  
}