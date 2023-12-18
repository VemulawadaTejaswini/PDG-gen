import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] A = new int[N-1];
    for(int i=0; i<N-1; i++) {
      A[i] = scan.nextInt();
    }
    scan.close();

    int[] count = new int[N];
    for(int i=0; i<N-1; i++) {
      count[A[i]-1]++;
    }
    for(int i=0; i<N; i++) {
      System.out.println(count[i]);
    }
  }
}