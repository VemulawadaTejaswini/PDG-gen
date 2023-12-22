import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String str;
			while(!(str = reader.readLine()).equals("0")) {
				int n = Integer.parseInt(str);
			
				str = reader.readLine();
				String[] score = str.split(" ");
			
				double s[] = new double[n];
				double m = 0;
				for (int i = 0; i < n; i++) {
					s[i] = Double.parseDouble(score[i]);
					m += s[i];
				}
				m /= n;
				double a2 = 0;
				for (int i = 0; i < n; i++) {
					a2 += Math.pow(s[i] - m, 2.0);
				}
				a2 /= n;
				double a = Math.sqrt(a2);
				System.out.println(a);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}