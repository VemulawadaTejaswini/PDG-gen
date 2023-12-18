import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] strArray = br.readLine().split(" ");
		long[] array = new long[N + 1];
		array[0] = Long.parseLong(strArray[0]);
		long save1 = array[0];
		long save2 = 0;
		long result = save1;
		for (int i = 1; i < N; i++) {
			save2 = Long.parseLong(strArray[i]);
			array[i] = Math.max(save1, save2);
			result = array[i];
			save1 = save2;
		}

		System.out.println(result);
	}

}
