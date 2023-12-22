import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int sum = 0;
    int[] prices = new int[n];
    for(int i = 0; i < n; i++){
      prices[i] = sc.nextInt();
    }
    Arrays.sort(prices);
    for(int i = 0; i < k; i++){
      sum += prices[i];
    }
    System.out.println(sum);
  }
}