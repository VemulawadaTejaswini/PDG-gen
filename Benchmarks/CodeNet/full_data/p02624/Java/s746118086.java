import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(solve2(n));
  }
  static long solve2(long n){
    long answer = 0;
    for(long i = 1; i <= n; i++){
      answer += (i + (i * (n / i))) * (n / i) / 2;
    }
    return answer;
  }
}
