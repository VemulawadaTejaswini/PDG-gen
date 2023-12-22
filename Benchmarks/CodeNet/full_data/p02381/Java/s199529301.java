import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while(true){

			int num = Integer.parseInt(br.readLine());

			if(num == 0){
				break;
			}

			String[] token = br.readLine().split(" ");
			int[] point = new int[num];
			double sum = 0;

			for(int i = 0; i < num; i++){
				point[i] = Integer.parseInt(token[i]);
				sum += point[i];
			}

			double average = sum / num;
			sum = 0;

			for(int i = 0; i < num; i++){
				sum += Math.pow(point[i] - average, 2);
			}

			double dispersion = sum / num;
			double deviation = Math.sqrt(dispersion);

			sb.append(String.format("%.8f\n", deviation));

		}

		System.out.print(sb);

	}
}