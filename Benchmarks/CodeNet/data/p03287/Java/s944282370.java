import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
   
    while (in.hasNext()) {
      int N = in.nextInt();
      int M = in.nextInt();
      long[] A = new long[N + 1];
      for (int i = 1; i < A.length; ++i) {
        A[i] = in.nextInt() + A[i - 1];
      }
      
      long count = 0;
      for (int i = 0; i < A.length; ++i) {
        for (int j = i + 1; j < A.length; ++j) {

          if ((A[j] - A[i]) % M == 0) {
            ++count;
          }
        }
      }

      System.out.println(count);
    }
  }
}