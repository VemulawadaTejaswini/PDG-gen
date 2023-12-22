import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Boolean isEnd = str == null;
		int count;
		while (!isEnd) {
			int n = Integer.parseInt(str);
			count = 0;
			for (int a = 0; a <= 9; a++) {
				if (n - a < 0) {
					break;
				}
				for (int b = 0; b <= 9; b++) {
					if (n - a - b < 0) {
						break;
					}
					for (int c = 0; c <= 9; c++) {
						if (n - a - b - c < 0) {
							break;
						} else if (n - a - b - c > 9) {
							continue;
						} else {
							count++;
						}
					}
				}
			}
			System.out.println(count);
			str = br.readLine();
			isEnd = str == null;
		}
	}

}