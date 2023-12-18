import java.util.*;

public class PlacingMarbles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		if (1 <= N && N <= 100) {
			if (0 <= M && M <= N) {
				if (M == N) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}

}
