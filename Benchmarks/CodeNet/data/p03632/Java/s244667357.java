import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();

    int E = Math.max(A,C);
    int F = Math.min(B,D);

    System.out.println(F - E);

  }
}