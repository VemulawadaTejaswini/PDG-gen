import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null) {
			String[] datasetstr = str.split(" ", 6);
			int a = Integer.parseInt(datasetstr[0]);
			int b = Integer.parseInt(datasetstr[1]);
			int c = Integer.parseInt(datasetstr[2]);
			int d = Integer.parseInt(datasetstr[3]);
			int e = Integer.parseInt(datasetstr[4]);
			int f = Integer.parseInt(datasetstr[5]);
			double x = (double)(e * c - b * f) / (a * e - b * d);
			double y = (double)(a * f - c * d) / (a * e - b * d);
			System.out.println((double)Math.round(x*1000)/1000 + " " + (double)Math.round(y*1000)/1000);
			str=br.readLine();
		}
	}
}