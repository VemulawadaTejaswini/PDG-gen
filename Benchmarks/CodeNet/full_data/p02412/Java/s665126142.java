import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
		String x = "";
		try {
			while ((x = in.readLine()).equals("0 0") == false) {
				String[] data = x.split(" ");
				int n = Integer.parseInt(data[0]);
				int sum = (Integer.parseInt(data[1]) - 3);
				
				int num = 0;
				for (int i = 0; i < n; i++) {
					for (int j = (i + 1); (i + j) < sum; j++) {
						int k = sum - (i + j);
						if ((k > j) && (k < n)) num++;
					}
				}
				
				System.out.println(num);
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