import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    if(A == B){
      System.out.println(A);
    } else {
      System.out.println((A-1)^((A-1)/2%2)^B^(B%2));
    }
  }
}
