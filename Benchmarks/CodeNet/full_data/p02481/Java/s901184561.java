import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			String line = reader.readLine();
			String[] strAry = line.split("\\s+");
			int x = Integer.parseInt(strAry[0]);
			int y = Integer.parseInt(strAry[1]);
			
			System.out.println(+(x * y)+" "+((x+y)*2));

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}