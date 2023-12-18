import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] a = new int[N];
    int[] count = new int[N + 10];
    int max = 0;
    int ans = 0;
    for (int i = 0; i < N; i++){
      a[i] = scanner.nextInt();
    }
    for (int i = 0; i < N; i++){
      count[a[i]]++;
    }
    for (int i = 0; i < N; i++){
      max = count[a[i]] + count[a[i] + 1] + count[a[i] - 1];
      ans = Math.max(ans, max);
      max = 0;
    }
    System.out.println(ans);
  }
}
