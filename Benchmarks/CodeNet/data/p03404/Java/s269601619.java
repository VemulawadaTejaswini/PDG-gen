import java.util.*;

public class Main {
	public static void main(String[] args) {
		//ABC086A(); 
		//ABC081A();
		//TravelingPlan();
		GridComponents();
	}
        public static void GridComponents() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		boolean[][] hw = new boolean[100][100];
		for(int i = 0; i < 50; i++) {
			for(int j = 0; j < 100; j++) {
				hw[i][j] = true;
			}
		}
		for(int i = 0; i < A - 1; i++) {
			int x = 2 * i / 50;
			int y = 2 * i % 50;
			hw[x][y] = false;
		}
		for(int i = 0; i < B - 1; i++) {
			int x = 2 * i / 50 + 51;
			int y = 2 * i % 50;
			hw[x][y] = true;
		}
		
		System.out.println("100 100");
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				System.out.print(hw[i][j] ? '#' : '.');
			}
			System.out.println();
		}
	}
	
}