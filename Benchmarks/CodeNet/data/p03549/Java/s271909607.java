import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    System.out.println((100 * (N - M) + 1900 * M) * (int)Math.pow(2, M));
  }
}