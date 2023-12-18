import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int D = sc.nextInt();
    int X = sc.nextInt();

    int[] A = new int[N];

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    sc.close();

    int count = 0;

    for (int i = 0; i < N; i++) {
      
      int j = 1;
      int k = 2;

      while (j <= D) {

        if (j == 1) {
          count++;
        } else if (((k-1) * A[i] + 1) == j) {
          count++; 
          k++;
        }

        j++;
      }

    }

    System.out.println(count + X);

  }

}