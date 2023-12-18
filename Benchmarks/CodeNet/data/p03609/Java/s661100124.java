import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] a = new int[N];
    int[] count = new int[100010];
    int max = 0;
    int ans = 0;
    for (int i = 0; i < N; i++){
      a[i] = scanner.nextInt();
    }
    for (int i = 0; i < N; i++){
      count[a[i]]++;
    }
    for (int i = 1; i < 100009; i++){
      max = count[i] + count[i + 1] + count[i - 1];
      ans = Math.max(ans, max);
      max = 0;
    }
    System.out.println(ans);
  }
}
