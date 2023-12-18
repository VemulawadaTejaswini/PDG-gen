import java.util.*;

public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int D = sc.nextInt();
      int range = 2 * D + 1;
      int numGuard =  (int)Math.ceil(N / (double)range);
      System.out.println(numGuard);
    }
}