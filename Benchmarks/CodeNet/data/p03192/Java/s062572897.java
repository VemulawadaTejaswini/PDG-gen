import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] read = br.readLine().split("");
		int count = 0;
		for(int i = 0; i < 4; i++) {
			if(read[i].equals("2")) {
				count++;
			}
		}
		System.out.println(count);
	}
}