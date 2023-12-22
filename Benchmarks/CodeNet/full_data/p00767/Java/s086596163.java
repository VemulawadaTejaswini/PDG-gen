import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] ia;

		while (true) {
			ia = in.readLine().split(" ");
			int h = Integer.parseInt(ia[0]);
			int w = Integer.parseInt(ia[1]);
			if(h == 0 && w == 0){
				break;
			}
			int value = h * h + w * w;
			int x = 200;
			int y = 200;
			int ans = 200 * 200 + 200 * 200;
			boolean yet = true;
			for (int i = 1; i <= 150; ++i) {
				for (int j = i + 1; j <= 150; ++j) {
					int tmp = i * i + j * j;
					if (value < tmp && tmp < ans) {
						x = j;
						y = i;
						ans = tmp;
					} else if (value == tmp) {
						if (yet && h < i) {
							x = j;
							y = i;
							ans = tmp;
							yet = false;
						}
					}
				}
			}
			System.out.println("" + y + " " + x);
		}
	}

}