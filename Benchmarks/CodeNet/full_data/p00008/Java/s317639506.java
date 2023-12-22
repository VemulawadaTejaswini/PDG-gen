import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int num[]=new int[51];
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9; k++) {
					for (int l = 0; l <= 9; l++)
						num[i+j+k+l]++;
				}
			}
		}
		while (null != (str = in.readLine())) {
			System.out.println(num[Integer.parseInt(str)]);
		}
	}
}