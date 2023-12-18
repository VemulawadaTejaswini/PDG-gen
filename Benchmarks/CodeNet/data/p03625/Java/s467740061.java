import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] A = new int[N];
    int ans = 1;
    int count = 0;
    for (int i = 0; i < N; i++){
      A[i] = scanner.nextInt();
    }
    Arrays.sort(A);
    for (int i = N - 1; i > 0; i--){
      if (A[i] == A[i - 1]){
        ans *= A[i];
        count++;
      } else {
        System.out.println(0);
        break;
      }
      if (count == 2)
      System.out.println(ans);
    }
  }
}
