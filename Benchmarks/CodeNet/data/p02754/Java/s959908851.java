import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int answer = A * N / (A + B);
    if(A > 0){
      int n = N % (A + B);
      if(N % (A + B) > A + B){
        n = n - B;
      }
      answer = answer + n;
    }
    System.out.println(answer);
  }
}