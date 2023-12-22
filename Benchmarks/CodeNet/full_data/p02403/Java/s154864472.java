import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
		String x = "";
		try {
			x = in.readLine();
			if (x.equals("0 0"));
			
			String[] values = x.split(" ");

			int a = Integer.parseInt(values[0]);;
			int b = Integer.parseInt(values[1]);;
			
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					System.out.print('#');
				}
				System.out.println();
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}