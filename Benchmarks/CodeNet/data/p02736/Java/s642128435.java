import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    String a = scan.next();
    scan.close();

    int[][] ar = new int[N][N];
    for(int j=0; j<N; j++) {
      ar[0][j] = a.charAt(j) - '0';
    }
    for(int i=1; i<N; i++) {
      for(int j=0; j<N-i; j++) {
        ar[i][j] = Math.abs(ar[i-1][j] - ar[i-1][j+1]);
      }
    }

    System.out.println(ar[N-1][0]);
  }
}