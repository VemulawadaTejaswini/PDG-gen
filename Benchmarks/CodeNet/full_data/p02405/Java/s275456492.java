import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		try {
			while ((buffer = reader.readLine())  != null) {
				Integer H = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
				buffer = buffer.substring(buffer.indexOf(" ") + 1);
				Integer W = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
				if (H == 0 && W == 0) {
					return;
				}
				for (int i = 0; i < H; i++) {
					int amari;
					amari = i - i / 2 * 2 == 0 ? 0 : 1;
					for (int j = 0; j < W; j++) {
						if (j - j / 2 * 2 + amari == 1) {
							System.out.print(".");
						}
						else {
							System.out.print("#");
						}
					}
					System.out.println();
				}
				System.out.println();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}