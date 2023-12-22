import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int debt = 100000;
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			debt *= 1.05;
			if ((debt - ((debt/1000) * 1000))!=0) {
				debt = (debt/1000) * 1000 + 1000;
			} else {
				debt = (debt/1000) * 1000;
			}
		}
		
		System.out.println(debt);
	}

}