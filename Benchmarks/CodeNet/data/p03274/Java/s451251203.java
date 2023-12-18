import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] input = sc.nextLine().split("[\\s]+");
    int N = Integer.parseInt(input[0]);
    int K = Integer.parseInt(input[1]);
    String[] inputX = sc.nextLine().split("[\\s]+");
    int[] x = new int[N];
    for(int i = 0; i < N; i++) {
      x[i] = Integer.parseInt(inputX[i]);
    }
    int min = 0;
    for(int i = 0; i < N - K + 1; i++) {
      int sum1 = Math.abs(x[i]) + Math.abs(x[i] - x[i+K-1]);
      int sum2 = Math.abs(x[i+K-1]) + Math.abs(x[i+K-1] - x[i]);
      int sum = Math.min(sum1,sum2);
      if(i == 0 || sum < min) {
        min = sum;
      }
    }
    System.out.println(min);
  }
}