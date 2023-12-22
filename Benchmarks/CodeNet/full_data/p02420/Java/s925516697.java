import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static String[] chara;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Boolean isEnd = str.equals("-");
		while (!isEnd) {
			String defaultstr = str;
			str = br.readLine();
			int count = Integer.parseInt(str);
			int[] shuffleamount = new int[count];
			for (int i = 0; i < count; i++) {
				str = br.readLine();
				shuffleamount[i] = Integer.parseInt(str);
			}
			chara = defaultstr.split("", 0);
			int length = chara.length;
			for (int j = 0; j < count; j++) {
				Shuffling(shuffleamount[j], length);
			}
			for (String charac : chara) {
				System.out.print(charac);
			}
			System.out.println();
			str = br.readLine();
			isEnd = str.equals("-");
		}
	}

	private static void Shuffling(int h, int l) {
		String[] temporary = new String[h];
		for (int k = 0; k < h; k++) {
			temporary[k] = chara[k];
		}
		for (int m = 0; m < l - h; m++) {
			chara[m] = chara[h + m];
		}
		for (int n = 0; n < h; n++) {
			chara[l - h + n] = temporary[n];
		}
	}
}