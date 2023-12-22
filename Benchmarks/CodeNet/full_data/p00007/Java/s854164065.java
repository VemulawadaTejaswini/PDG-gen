import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		int money = 100000;
		try {
			if ((line = br.readLine()) != null) {
				line = line.trim();
				int weeks = Integer.parseInt(line);
				if(weeks <= 0 || weeks > 100) System.exit(-1);
				
				for(int i = 0; i < weeks; i++) {
					money *= 1.05;
					if(money % 1000 != 0) {
						money += 1000 - (money % 1000);
					}
				}
				System.out.println(money);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}