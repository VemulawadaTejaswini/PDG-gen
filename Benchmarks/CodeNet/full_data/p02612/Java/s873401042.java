import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String N = scan.nextLine();
    Integer N_int = String.parseInt(N);
    Integer R = N_int % 1000;
    
    if(R == 0) {
      System.out.println(0);
    }
    else {
      System.out.println(R);
    }
  }
}