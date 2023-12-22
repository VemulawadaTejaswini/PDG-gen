import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int[][] students = new int[100][100];
		boolean[][] min = new boolean[100][100];
		List<Integer> list = new ArrayList<Integer>();
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			int e;
			for (int i = 0; i < n; i++) { 
				list.clear();
				e = 1000000000;
				for (int j = 0; j < n; j++) {
					students[i][j] = sc.nextInt();
					if (students[i][j] < e) {
						e = students[i][j];
						list.clear();
						list.add(j);
					} else if (students[i][j] == e) {
						list.add(j);
					}
					min[i][j] = false;
				}
				for (int index : list)
					min[i][index] = true;
			}
			
			boolean flag = false;
			J:for (int j = 0; j < n; j++) {
				list.clear(); e = 0;
				for (int i = 0; i < n; i++) {
					if (students[i][j] > e) {
						e = students[i][j];
						list.clear();
						list.add(i);
					} else if (students[i][j] == e) {
						list.add(i);
					}
				}
				for (int index : list) {
					if (min[index][j]) {
						out.println(students[index][j]);
						flag = true;
						break J;
					}
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