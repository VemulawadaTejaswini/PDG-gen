import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    int[] H = new int[N];
    for(int i=0; i<N; i++) {
      H[i] = scan.nextInt();
    }
    scan.close();

    Arrays.sort(H);

    long sum = 0;
    for(int i=0; i<N-K; i++) {
      sum += H[i];
    }

    System.out.println(sum);
  }
}