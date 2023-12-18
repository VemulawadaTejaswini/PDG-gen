import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    int[] p = new int[N];
    for(int i=0; i<N; i++) {
      p[i] = scan.nextInt();
    }
    scan.close();

    int sum = 0;
    for(int i=0; i<K; i++) {
      sum += p[i] + 1;
    }
    int max = sum;
    for(int i=0; i<N-K; i++) {
      sum = sum - p[i] + p[i+K];
      if(max < sum) {
        max = sum;
      }
    }
    System.out.println(String.format("%.12f", (double)max / 2));
  }
}