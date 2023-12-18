import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner stdin = new Scanner(System.in);
    int A = stdin.nextInt();
    int B = stdin.nextInt();
    int C = stdin.nextInt();

    if(A == B){
      System.out.println(C);
    }
    if(B == C){
      System.out.println(A);
    }
    if(A == C){
      System.out.println(B);
    }
  }
}
