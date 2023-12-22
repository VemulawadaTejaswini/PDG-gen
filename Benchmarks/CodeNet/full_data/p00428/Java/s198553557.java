import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (!str.equals("0 0")) {
			String[] nm = str.split(" ");
			int n = Integer.parseInt(nm[0]);
			int m = Integer.parseInt(nm[1]);
			int[] score = new int[m];
			int[] name = new int[m];
			for (int i = 0; i < n; i++) {
				str = br.readLine();
				String[] answer = str.split(" ");
				for (int j = 0; j < m; j++) {
					score[j] = score[j] + Integer.parseInt(answer[j]);
					name[j] = j + 1;
				}
			}
			name = Sort(score, name);
			for (int names : name) {
				System.out.print(names);
			}
			System.out.println();
			str = br.readLine();
		}
	}

	private static int[] Sort(int[] num, int[] name) {
		int length = num.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (num[i] < num[j]) {
					int tmpnum = num[i];
					int tmpname = name[i];
					num[i] = num[j];
					name[i] = name[j];
					num[j] = tmpnum;
					name[j] = tmpname;
				}
			}
		}
		return name;
	}
}