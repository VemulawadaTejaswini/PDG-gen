
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// ???????????\???
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String str[] = input.split(" ");

		int h = Integer.parseInt(str[0]); // ??????
		int w = Integer.parseInt(str[1]); // ??????

		while (true) {
			if (h == 0 && w == 0) {
				// ??¨??????0
				break;
			} else {
				// ????????\???
				for (int i = 0; i < h; i++) {
					if ((i + 1) % 2 == 0) {
						for (int j = 0; j < w; j++) {
							if ((j + 1) % 2 == 0) {
								// ??????(#?????????)
								System.out.print("#");
							} else {
								System.out.print(".");
							}
						}

					} else {
						for (int j = 0; j < w; j++) {
							// ??????(#?????????)
							if ((j + 1) % 2 == 0) {
								// ??????(#?????????)
								System.out.print(".");
							} else {
								System.out.print("#");
							}
						}
						// ??????(??????)
						System.out.println();
					}
					System.out.println();
					// ?¬??????\??????????????????
					input = br.readLine();
					str[0] = null;
					str[1] = null;
					str = input.split(" ");
					h = Integer.parseInt(str[0]);
					w = Integer.parseInt(str[1]);
				} // for
			} // if
		} // while
	}// main
}