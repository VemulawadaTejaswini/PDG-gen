import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    String a = scan.next();
    scan.close();

    int[] ar = new int[N];
    for(int i=0; i<N; i++) {
      ar[i] = a.charAt(i) - '0';
    }
    int count = 1;
    while(count < N) {
      for(int i=0; i<N-count; i++) {
        ar[i] = Math.abs(ar[i] - ar[i+1]);
      }
      count++;
    }

    System.out.println(ar[0]);
  }
}