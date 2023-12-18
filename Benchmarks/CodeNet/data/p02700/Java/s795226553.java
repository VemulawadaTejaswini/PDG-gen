import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int C = scan.nextInt();
    int D = scan.nextInt();
    
    int res1 = C / B;
    int res2 = A / D;
    if(res1 > res2) {
      System.out.println("No");
    }
    else {
      System.out.println("Yes");
    }

  }
}