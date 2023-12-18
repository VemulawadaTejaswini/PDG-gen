import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  	int a1, a2, a3;
    Scanner scanner = new Scanner(System.in);
    a1 = scanner.nextInt();
    a2 = scanner.nextInt();
    a3 = scanner.nextInt();
    
    int sum = a1 + a2 + a3;
    
    if (sum >= 22) {
    	System.out.println("bust");
    } else {
    	System.out.println("win");
    }
  }
}
