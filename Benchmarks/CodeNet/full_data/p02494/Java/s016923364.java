import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] buf = br.readLine().split(" ");
			if (buf[0].equals("0"))
				break;

			int[] size = new int[2];
			for (int i = 0; i < 2; i++) {
				size[i] = Integer.parseInt(buf[i]);
			}
			for (int i = 0; i < size[0]; i++) {
				for (int j = 0; j < size[1]; j++) {
					System.out.print("#");
				}
				System.out.println("");
			}
		}
	}
}