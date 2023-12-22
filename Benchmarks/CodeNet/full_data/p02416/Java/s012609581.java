import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
		String x = "";
		try {
			while ((x = in.readLine()).equals("0") == false) {
				int sum = 0;
				for (int i = 0; i < x.length(); i++) {
					sum = sum + x.charAt(i) - '0';
				}
				
				System.out.println(sum);
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