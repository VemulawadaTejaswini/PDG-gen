import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String str = reader.readLine();
			int n = Integer.parseInt(str);
			str = reader.readLine();
			String[] vx = str.split(" ");
			str = reader.readLine();
			String[] vy = str.split(" ");
			
			double x = 0.0;
			double y = 0.0;
			double dist = 0.0;
			System.out.println(Math.pow(Math.pow(2, Double.POSITIVE_INFINITY), 1.0 / Double.POSITIVE_INFINITY));
			double[] exp = {1.0, 2.0, 3.0};
			double max = 0.0;
			double abs = 0.0;
			for (int j = 0; j < 3; j++) {
				for (int i = 0; i < n; i++) {
					x = Double.parseDouble(vx[i]);
					y = Double.parseDouble(vy[i]);
					abs = Math.abs(x - y);
					dist += Math.pow(abs, exp[j]);
					if (max < abs) {
						max = abs;
					}
				}
				System.out.println(Math.pow(dist, 1.0 / exp[j]));
			}
			System.out.println(max);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}