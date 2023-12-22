
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		List<Double[]> results = new ArrayList<Double[]>();
		
		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			if (!st.hasMoreTokens()) break;
			
			double a = Integer.parseInt(st.nextToken());
			double b = Integer.parseInt(st.nextToken());
			double c = Integer.parseInt(st.nextToken());
			double d = Integer.parseInt(st.nextToken());
			double e = Integer.parseInt(st.nextToken());
			double f = Integer.parseInt(st.nextToken());
			double i = a;
			double j = d;
			
			a = a * j;
			b = b * j;
			c = c * j;
			d = d * i;
			e = e * i;
			f = f * i;
			
			//System.out.printf("%f %f %f %f %f %f", a, b, c, d, e, f);
			
			double y = (c - f) / (b - e);
			double x = (c - b * y) / a;
			
			results.add(new Double[] {x, y});
		}
		
		for (Double[] ans : results) {
			System.out.printf("%.3f %.3f\n", ans[0], ans[1]);
		}
	}
}