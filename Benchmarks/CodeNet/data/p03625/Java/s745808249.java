import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    Integer[] A = new Integer[N];

    for (int i = 0; i < N; i++) {
      A[i] = Integer.valueOf(sc.next());
    }

    sc.close();

    Arrays.sort(A, Comparator.reverseOrder());

    int count = 1;
    long tate = 0;
    long yoko = 0;

    for (int i = 0; i < N-1; i++) {
      if (A[i] == A[i+1]) {
        count++;
      } else {
        count = 1;
      }
      if (count == 2) {
        if (tate == 0) {
          tate = A[i];
          count = 0;
        } else if (yoko == 0) {
          yoko = A[i];
          break;
        }
      }

    }

    System.out.println(tate * yoko);

  }

}