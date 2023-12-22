import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String number = reader.readLine();
			int n = Integer.parseInt(number);

			String cards;
			String[] card = new String[2];
			int judge;
			int taro = 0;
			int hanako = 0;
			for (int i = 0; i < n; i++) {
				cards = reader.readLine();
				card = cards.split(" ");
				judge =  card[0].compareTo(card[1]);
				if (judge > 0) {
					taro += 3;
				} else if (judge < 0) {
					hanako += 3;
				} else {
					taro++;
					hanako++;
				}
			}
			System.out.println(taro + " " + hanako);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}