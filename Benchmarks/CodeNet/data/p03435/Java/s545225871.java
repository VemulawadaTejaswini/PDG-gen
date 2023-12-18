import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] map = new int[3][3];
		for (int i = 0; i < 9; i++) {
			map[i / 3][i % 3] = sc.nextInt();
		}
		
		for (int a1 = 0; a1 <= 100; a1++) {
			int b1 = map[0][0] - a1;
			int b2 = map[0][1] - a1;
			int b3 = map[0][2] - a1;
			int a2 = map[1][0] - b1;
			int a3 = map[2][0] - b1;
			if (map[1][1] == a2 + b2 && map[1][2] == a2 + b3 && map[2][1] == a3 + b2 && map[2][2] == a3 + b3) {
				System.out.println("Yes");
				return;
			}	
		}
		
		System.out.println("No");
	}
}