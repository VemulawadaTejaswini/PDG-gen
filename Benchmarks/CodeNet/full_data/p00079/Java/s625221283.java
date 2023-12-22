import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
		double x[] = new double[20];
		double y[] = new double[20];
		int i = 0;
		while ((line = br.readLine() ) != null){
			String numbers[] = line.split(",");
			double answer[] = new double[2];
			answer[0] = Double.parseDouble(numbers[0]);
			answer[1] = Double.parseDouble(numbers[1]);				
			x[i] = answer[0]-x[0];
			y[i] = answer[1]-y[0];
			i++;
		}
		double area = 0;
		for (int k = 0; k<i; k++){
			area += x[k]*y[k+1]-x[k+1]*y[k];
		}
		System.out.println(Math.abs(area*0.5));
	}
}