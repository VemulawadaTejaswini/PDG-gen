import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int C = scan.nextInt();
    int K = scan.nextInt();
    int sum = 0;
    if (A > K) {
      sum = K;
    }
    else if (A + B > K) {
      sum = A;
    }
    else{
      C = K - B - A;
      sum = A - C;
    }
    System.out.println(sum);
  }
}