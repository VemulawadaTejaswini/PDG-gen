import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) System.out.print(" " + i);
			else if (i % 10 == 3)  System.out.print(" " + i);
			else {
				int j = i;
				while (j > 0) {
					j /= 10;
					if (j < 3) break;
					else if (j % 10 == 3) {
						System.out.print(" " + i);
						break;
					}
				}
			}
		}
		System.out.println();
	}
}