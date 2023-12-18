
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmp = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(tmp[0]);
		int h = Integer.parseInt(tmp[1]);

		if(h % 100 != 0) {
			sb.append(tmp[1]);
			for(int i = 0; i < Integer.parseInt(tmp[0]); i++) {

				sb.append("00");
			}
		}else {

			sb.append(h + 1);
			for(int i = 0; i < Integer.parseInt(tmp[0]); i++) {

				sb.append("00");
			}
		}



		System.out.println(sb.toString());

	}
}
