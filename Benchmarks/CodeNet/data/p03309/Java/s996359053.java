import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] A = new int[N];

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    sc.close();

    int[] d = new int[N];

    for (int i = 0; i < N; i++) {
      d[i] = i + 1 - A[i]; 
    }

    Arrays.sort(d);

    int d_ = 0;
    
    d_ = (int)Math.ceil((double)N/2) - 1;

    int min = 0;

    for (int i = 0; i < N; i++) {
      min += Math.abs(i + 1 - A[i] - d[d_]);
    }

    System.out.println(min);

  }

}