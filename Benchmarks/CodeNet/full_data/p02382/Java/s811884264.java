import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		String[] vectorX = br.readLine().split(" ");
		String[] vectorY = br.readLine().split(" ");

		double distanceP1 = 0;
		double distanceP2 = 0;
		double distanceP3 = 0;
		double max = 0;
		double p1 = 1;
		double p2 = 2;
		double p3 = 3;

		for(int i = 0; i < num;i++){
			double convertX = Double.parseDouble(vectorX[i]);
			double convertY = Double.parseDouble(vectorY[i]);
			double vectorElement = Math.abs(convertX - convertY);

			distanceP1 += Math.pow(vectorElement, p1);
			distanceP2 += Math.pow(vectorElement, p2);
			distanceP3 += Math.pow(vectorElement, p3);
			max = Math.max(max, vectorElement);
		}
		System.out.printf("%.6f\n", Math.pow(distanceP1, 1.0/p1));
		System.out.printf("%.6f\n", Math.pow(distanceP2, 1.0/p2));
		System.out.printf("%.6f\n", Math.pow(distanceP3, 1.0/p3));
		System.out.printf("%.6f\n", max);

		br.close();
	}
}