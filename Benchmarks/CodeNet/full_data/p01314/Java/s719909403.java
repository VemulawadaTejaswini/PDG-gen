
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int count = 0;
	static int input = 0;
	static int ans;

	public static void sum(int x, int y) {
		ans =  (x + y) * (y - x + 1) / 2;
//		return ans;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			input=0;
			count=0;
			String num = br.readLine();
			if (num.equals("0")) {
				return;
			}

			input = Integer.parseInt(num);

			for (int i = 1; i < input; i++) {
				for (int j = i+1; j < input; j++) {
					sum(i,j);
					if (input == ans) {
						count++;
						break;
					}
					if (input < ans) {
						break;
					}
				}
				if(i > 1+input/2 ) {
					break;
				}
			}
			System.out.println(count);
		}
	}

}

