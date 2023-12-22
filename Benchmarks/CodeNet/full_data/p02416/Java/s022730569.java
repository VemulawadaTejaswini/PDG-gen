import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String array = null;
		int sum;

		try {
			while(true) {
				sum = 0;
				array = br.readLine();
				if(array.length() == 1 && array.equals("0")) break;

				for(int i = 0; i < array.length(); i++) {
					sum += (int)array.charAt(i) - '0';
				}
				System.out.printf("%d\n", sum);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

