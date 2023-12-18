import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long K = sc.nextLong();
    
    //long remaining = K - A;
    long checkA = A - K;
    if (checkA > 0){
      A = K - A;
    } else if (checkA <= 0) {
      K = K - A;
      A = 0;
      long checkB = B - K;
      
      if (checkB < 0) {
        B = 0;
      } else {
        B = checkB;
      }
    }  
    System.out.println(A+ " " + B);
  }
}