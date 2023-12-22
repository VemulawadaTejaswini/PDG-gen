import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		String x = "";
		try {
			while ((x = in.readLine()) != null) {
				int lim = Integer.parseInt(x);
				
				int count = 0;
				for (int a = 0; a < 10; a++) {
					if (a > lim) break;
					
					for (int b = 0; b < 10; b++) {
						int sum2 = a + b;
						if (sum2 > lim) break;
						
						for (int c = 0; c < 10; c++) {
							int sum3 = sum2 + c;
							if (sum3 > lim) break;
							
							if ((lim - sum3) < 10) count++;
						}
					}
				}
				
				System.out.println(count);
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