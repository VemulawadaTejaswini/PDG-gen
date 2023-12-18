import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int N = 0;
	static String S = "";
	static int K = 0;
	public static void main(String[] args) {
		//入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			N = Integer.parseInt(br.readLine());
			S = br.readLine();
			K = Integer.parseInt(br.readLine());

		} catch(IOException e) {
			e.printStackTrace();
		}

		char c = S.charAt(K-1);
		System.out.println(S.replace("[^" + c + "]", "*"));

	}
}