import java.io.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ?¨??????\??????????????????
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String dataset = br.readLine();
			int a = Integer.parseInt(dataset.split(" ")[0]);
			int b = Integer.parseInt(dataset.split(" ")[1]);
			int c = Integer.parseInt(dataset.split(" ")[2]);

			if (((a * a) + (b * b)) == (c * c)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}