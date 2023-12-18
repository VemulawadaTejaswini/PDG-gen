import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        if((A + B) >= K ) {
		System.out.println(1 * A);
		}
		else if((A + B) < K ) {
		System.out.println(1 * A + (K - A -B) * - 1);
		}
    }
}