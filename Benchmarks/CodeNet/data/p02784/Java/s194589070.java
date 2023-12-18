import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int H = scan.nextInt();
    int N = scan.nextInt();
    int[] A = new int[N];
    for(int i=0; i<N; i++) {
      A[i] = scan.nextInt();
    }
    scan.close();

    int sum = 0;
    for(int i=0; i<N; i++) {
      sum += A[i];
    }

    System.out.println(H > sum ? "No" : "Yes");
  }
}