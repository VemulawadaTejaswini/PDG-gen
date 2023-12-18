import java.util.Scanner;

public class Main {
	public static void main(String[] args) {      
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt();
      int X = sc.nextInt();
      int Y = sc.nextInt();
      int total = 0;
      if (N >= K) {
        total = K * X + (N-K) * Y;
      } else {
        total = N * X;
      }
      System.out.println(total);
    }
}