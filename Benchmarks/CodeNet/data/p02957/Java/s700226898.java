import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int K = 0;
    int ans = Math.abs(A-B);

    if(ans % 2 != 0) {
    	System.out.println("IMPOSSIBLE");
    	return;
    } else {
    	if (A > ans / 2) {
    		K = Math.abs(A - ans / 2);
    	} else {
    		K = Math.abs(A + ans / 2);
    	}
    	System.out.println(K);
    }
  }
}