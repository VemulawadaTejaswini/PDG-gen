import java.util.Arrays;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] A = new int[N];
    int count = 0;

    for(int i=0;i<N;i++) {
      A[i] = sc.nextInt();
    }

    Arrays.sort(A);

      for (int i=0; i<N-1; i++) {
        if (A[i] == A[i+1]) {
          count++;
        }
      }

      if (0 == count) {
        System.out.println("Yes");
      } else if (0 < count) {
        System.out.println("No");
      }
    }
  }