import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    long N = scanner.nextInt();
    long A = scanner.nextInt();
    long B = scanner.nextInt();
    long answer = 0;
    if(N != 0){
      answer = A * N / (A+B);
      if(A != 0){
        answer = answer + N % (A+B);
      }
    }
    System.out.println(answer);
  }
}