import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
	public static void main(String[] args) {

		String bar[] = new String[5];
		String temp;

		for(int i=0;i<5;i++) {



		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String str = null;
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
			bar[i] = str;
		}

		temp = bar[0];
		bar[0] = bar[2];
		bar[2] = temp;

		temp = bar[4];
		bar[4] = bar[0];
		bar[0] = bar[4];

	}
}
