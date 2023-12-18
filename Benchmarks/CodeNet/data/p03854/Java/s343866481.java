import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));

		String S = buff.readLine();
		String[] divide = {"dream", "erase", "eraser" ,"dreamer"};

		S = S.replace("eraser", "1");
		S = S.replace("erase", "1");
		S = S.replace("dreamer", "1");
		S = S.replace("dream", "1");
		S = S.replace("1", "");
		System.out.println(S);
	}

	static long f() {
		long ans = 0;

		return ans;
	}
}