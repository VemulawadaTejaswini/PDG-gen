import java.util.*;


public class Main {
	
	int n;
	
	int solve(int y, int m, int d) {
		int[] lastday = new int[]{20, 19, 20, 19, 20, 19, 20, 19, 20, 19};
		
		int days = 0;
		while (true) {
			int leap = (y % 3 == 0 && m % 2 == 0) ? 1 : 0;
			if (d == lastday[m - 1] + leap + 1) {
				d = 1;
				m++;
				if (m == 11) {
					m = 1;
					y++;
				}
			}
			
			if (y == 1000 && m == 1 && d == 1) {
				break;
			}
			
			d++;
			days++;
		}
		return days;
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		String output = "";
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			output += solve(sc.nextInt(), sc.nextInt(), sc.nextInt()) + "\n";
		}
		sc.close();
		System.out.print(output);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}