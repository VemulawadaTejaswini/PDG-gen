import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		String[] vectorX = br.readLine().split(" ");
		String[] vectorY = br.readLine().split(" ");

		double[] vectorElement = new double[num];

		double distanceP1 = 0;
		double distanceP2 = 0;
		double distanceP3 = 0;
		double max = 0;

		for(int i = 0; i < num;i++){
			double convertX = Double.parseDouble(vectorX[i]);
			double convertY = Double.parseDouble(vectorY[i]);

			vectorElement[i] =Math.abs(convertX - convertY);
			distanceP1 += vectorElement[i];

			double power2Abs = Math.abs(vectorElement[i] * vectorElement[i]);
			distanceP2 += power2Abs;

			double power3Abs = Math.abs(vectorElement[i] * vectorElement[i] * vectorElement[i]);
			distanceP3 += power3Abs;

			if (i == 0){
				max = vectorElement[0];
			} else if (i > 0){
				max = Math.max(max, vectorElement[i]);
			}
		}
		System.out.printf("%.6f\n", distanceP1);

		double distanceP2Sqrt = Math.sqrt(distanceP2);
		System.out.printf("%.6f\n", distanceP2Sqrt);

		double distanceP3Cbrt = Math.cbrt(distanceP3);
		System.out.printf("%.6f\n", distanceP3Cbrt);

		System.out.printf("%.6f\n", max);

		br.close();
	}
}