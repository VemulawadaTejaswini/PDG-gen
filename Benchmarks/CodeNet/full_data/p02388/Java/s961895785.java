import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = br.readLine();
			int x;

			x = Integer.parseInt(input);
			
			if (!(x >= 1 && x <= 100)) {
				throw new IllegalArgumentException();
			}
			
			System.out.println((int)Math.pow(x, 3));
		
		} catch(NumberFormatException e) {
			e.printStackTrace();
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}