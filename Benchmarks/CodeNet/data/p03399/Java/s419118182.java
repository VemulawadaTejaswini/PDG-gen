import java.util.*;
public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int sum = 0;

    if (A < B) {
      sum = A;
    } else {
      sum = B;
    }

    if (C < D) {
      sum = sum + C;
    } else {
      sum = sum + D;
    }
    
    System.out.println(sum);

  }
}