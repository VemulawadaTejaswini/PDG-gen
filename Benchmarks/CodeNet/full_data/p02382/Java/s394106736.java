import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] x = new int[num];
		int[] y = new int[num];
		String[] x_token = br.readLine().split(" ");
		String[] y_token = br.readLine().split(" ");

		for(int i = 0; i < num; i++){
			x[i] = Integer.parseInt(x_token[i]);
			y[i] = Integer.parseInt(y_token[i]);
		}

		double[] ans = new double[4];

		for(int i = 0; i < 3; i++){

			double sum = 0;
			double max = 0;

			for(int j = 0; j < num; j++){
				sum = sum + Math.pow(Math.abs(x[j] - y[j]), i + 1);
				max = Math.max(max, Math.abs(x[j] - y[j]));
			}

			switch(i){
				case 0:
					ans[i] = sum;
					break;
				case 1:
					ans[i] = Math.sqrt(sum);
					break;
				case 2:
					ans[i] = Math.cbrt(sum);
					break;
			}

			ans[3] = max;

		}

		for(int i = 0; i < ans.length; i++){
			System.out.printf("%.8f\n", ans[i]);
		}

	}
}