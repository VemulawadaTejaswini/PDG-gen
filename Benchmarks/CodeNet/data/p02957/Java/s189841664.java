import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int ans = A+B;

    if(ans % 2 != 0) {
    	System.out.println("IMPOSSIBLE");
    } else {
    	System.out.println(ans/2);
    }
  }
}