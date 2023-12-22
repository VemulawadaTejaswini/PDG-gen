import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int[][] students = new int[100][100];
		boolean[][] min = new boolean[100][100];
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			int index, e;
			for (int i = 0; i < n; i++) { 
				index = 0; e = 1000000000;
				for (int j = 0; j < n; j++) {
					students[i][j] = sc.nextInt();
					if (students[i][j] < e) {
						e = students[i][j];
						index = j;
					}
					min[i][j] = false;
				}
				min[i][index] = true;
			}
			
			boolean flag = false;
			for (int j = 0; j < n; j++) {
				index = 0; e = 0;
				for (int i = 0; i < n; i++) {
					if (students[i][j] > e) {
						e = students[i][j];
						index = i;
					}
				}
				if (min[index][j]) {
					out.println(students[index][j]);
					flag = true;
					break;
				}
			}
			if (!flag)
				out.println(0);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}