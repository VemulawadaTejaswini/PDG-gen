import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			sc.nextLine();
			int[] enter = new int[1000];
			int[] sum = new int[1000];
			for (int i = 0; i < N; ++i) {
				char[] line = sc.nextLine().toCharArray();
				int h = (line[6] - '0') * 10 + line[7] - '0';
				int m = (line[9] - '0') * 10 + line[10] - '0';
				int time = h * 60 + m;
				boolean in = line[12] == 'I';
				int id = (line[14] - '0') * 100 + (line[15] - '0') * 10 + line[16] - '0';
				if (in) {
					enter[id] = time;
				} else {
					if (id == 0) {
						for (int j = 1; j < 1000; ++j) {
							if (enter[j] != 0) {
								sum[j] += time - Math.max(enter[j], enter[0]);
							}
						}
					} else {
						if (enter[id] != 0 && enter[0] != 0) {
							sum[id] += time - Math.max(enter[id], enter[0]);
						}
					}
					enter[id] = 0;
				}
			}
			int ans = 0;
			for (int i = 0; i < 1000; ++i) {
				ans = Math.max(ans, sum[i]);
			}
			System.out.println(ans);
		}
	}

}