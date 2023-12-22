import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int t = 0;
		int h = 0;
		String x = "";
		try {
			x = in.readLine();
			int n = Integer.parseInt(x);
			
			for (int i = 0; i < n; i++) {
				String[] words = in.readLine().split(" ");
				
				int judge = words[0].compareTo(words[1]);
				if (judge < 0) {
					h = h + 3;
				} else if (judge == 0) {
					t++;
					h++;
				} else {
					t = t + 3;
				}
			}
			System.out.println(t + " " + h);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}