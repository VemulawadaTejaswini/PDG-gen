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
    int min = 1000000000;
    for(int i = 0; i < N - 2; i++) {
      int sum = Math.abs(x[i]) + Math.abs(x[i+1]) + Math.abs(x[i+2]);
      if(sum < min) {
        min = sum;
      }
    }
    System.out.println(min);
  }
}