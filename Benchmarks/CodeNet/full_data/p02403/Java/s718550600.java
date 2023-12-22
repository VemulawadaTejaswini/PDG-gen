import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for(;;) {
			String num = br.readLine();
			String[] set = num.split(" ");

			int a = Integer.parseInt(set[0]);
			int b = Integer.parseInt(set[1]);

			if (a==0 && b==0) {
				break;
			}

			for (int i = 0; i < a ; i++) {
				for (int j = 0; j < b ; j++) {
					sb.append("#");
				}
				sb.append("\n");
			}
			sb.append("\n");
		}

		System.out.print(sb);

	}

}