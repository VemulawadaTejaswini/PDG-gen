import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line1 = reader.readLine();
		int count = 0;
		for(int i = 0; i < line1.length(); i++) {
			for(int j = i + 1; j <= line1.length(); j++) {
				long sub = Long.parseLong(line1.substring(i, j));
				if(sub % 2019 == 0) {
					count++;
					System.out.println(i + " " + j);
				}
			}
		}
		System.out.println(count);
	}

}
