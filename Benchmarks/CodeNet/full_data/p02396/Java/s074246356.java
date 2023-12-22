import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {

			ArrayList<Integer> list = new ArrayList<Integer>();
			String text;
			int num, i;
			do {
				text = br.readLine();
				num = Integer.parseInt(text);
				if (num == 0) {
					break;
				}
			} while (true);
			for (i = 0; i < list.size(); i++) {
				System.out.println("Case " + i + ": " + list.get(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}