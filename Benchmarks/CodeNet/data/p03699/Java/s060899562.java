import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] s = new int[N];
    int sum = 0;
    for (int i = 0; i< N; i++){
      s[i] = scanner.nextInt();
    }
    Arrays.sort(s);
    for (int i = 0; i < N; i++){
      sum += s[i];
    }
    for (int i = 0; i < N; i++){
      if (sum % 10 == 0){
        sum -= s[i];
      } else if (sum % 10 != 0){
        break;
      }
    }
    System.out.println(sum);
  }
}
