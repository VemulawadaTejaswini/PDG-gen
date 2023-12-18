import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = Math.min(N/(A+B),A);
    
    if(N%(A+B) == 0) {
      if(A==0){
        System.out.println(0);
      } else if(A!=0) {
        System.out.println((N/(A+B))*A);
      }
    } else if(N%(A+B) != 0) {
      System.out.println((N/(A+B))*A + C);
    }
  }
}