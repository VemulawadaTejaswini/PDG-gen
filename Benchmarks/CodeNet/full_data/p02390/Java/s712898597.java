import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = br.readLine();
			int s;

			s = Integer.parseInt(input);
			
			if (!(s >= 0 && s <= 86400)) {
				throw new IllegalArgumentException();
			}
			
			int hh = s / 3600;
			int mm = (s % 3600) / 60;
			int ss = s % 60;
			
			System.out.println(hh + ":" + mm + ":" + ss);
		
		} catch(NumberFormatException e) {
			e.printStackTrace();
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}