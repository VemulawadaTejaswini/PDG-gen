import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		if ((N+M)%2 == 0) {
			System.out.println((N+M)/2);
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}
}