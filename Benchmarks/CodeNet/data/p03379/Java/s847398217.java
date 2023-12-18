import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] X = new int[N];
    int[] Y = new int[N];
    for (int i=0; i<N; i++) {
      X[i] = sc.nextInt();
    }
    Y = X.clone();
    Arrays.sort(X);
    int med1 = X[N/2-1];
    int med2 = X[N/2];

    for (int i=0; i<N; i++) {
      int med;
      if (Y[i] <= med1) {
        med = med2;
      } else {
        med = med1;
      }
      System.out.println(med);
    }
  }
}
