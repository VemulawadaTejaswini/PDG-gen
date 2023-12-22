import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = null;
		String hStr = null;
		int count = 0;
		Map<Integer, String> map = new HashMap<>();
		
		while (true) {
			try {
				if (word == null) {
					word = br.readLine();

				}
				if ("-".equals(word)) {
					break;
				}
				hStr = br.readLine();
				int h = Integer.parseInt(hStr);
				word = word.substring(h, word.length()) + word.substring(0, h);
				map.put(count, word);
				
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} catch (NumberFormatException e ) {
				word = hStr;
				count++;
			}
		}
		
		for (Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getValue());
		}

	}

}

