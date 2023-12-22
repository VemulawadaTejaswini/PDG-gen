import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Double x[] = new Double[4];
		Double y[] = new Double[4];
		for (int i=0; i<n; i++){
			String numbers[] = br.readLine().split(" ");
			x[0] = Double.parseDouble(numbers[0]);
			y[0] = Double.parseDouble(numbers[1]);
			x[1] = Double.parseDouble(numbers[2]);
			y[1] = Double.parseDouble(numbers[3]);
			x[2] = Double.parseDouble(numbers[4]);
			y[2] = Double.parseDouble(numbers[5]);
			x[3] = Double.parseDouble(numbers[6]);
			y[3] = Double.parseDouble(numbers[7]);
			if ((x[0]-x[1])*(y[2]-y[3])-(x[2]-x[3])*(y[0]-y[1])<0.00000000001)
				System.out.println("YES");
			else System.out.println("NO");		
		}
	}
}